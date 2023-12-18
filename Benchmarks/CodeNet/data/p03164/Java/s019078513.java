import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        ArrayList<Goods> list = new ArrayList<Goods>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new Goods(sc.nextInt(), sc.nextInt()));
        }
        list.sort(Comparator.comparing(Goods::getCostperformance).reversed());
        new knapsackSolver(list, W);
    }
}

class knapsackSolver {
    ArrayList<Goods> list = new ArrayList<Goods>();
    int W;

    knapsackSolver(ArrayList<Goods> list, int W) {
        this.list = list;
        this.W = W;
        // System.out.println(Arrays.toString(list.toArray()));
        System.out.println(solve(new int[list.size()], 0L, 0));
    }

    long solve(int[] fix, long tempAns, int deep) {
        // System.out.println(Arrays.toString(fix));
        long z = 0;
        long sumWeight = 0;

        for (int i = 0; i < list.size(); i++) {
            if (fix[i] == 1) {
                Goods goods = list.get(i);
                z += goods.value;
                sumWeight += goods.weight;
            }
        }
        if (sumWeight > W)// 実行不可能
            return tempAns;

        for (int i = 0; i < list.size(); i++) {
            if (fix[i] != 0)
                continue;
            Goods goods = list.get(i);
            if (sumWeight + goods.weight < W) {
                z += goods.value;
                sumWeight += goods.weight;
            } else if (sumWeight + goods.weight == W) {
                z += goods.value;
                sumWeight += goods.weight;
                if (z > tempAns) {
                    tempAns = z;
                    // System.out.println(tempAns);
                    return tempAns;// 更新
                }
                return tempAns;// 終端
            } else {
                double check = z + (double)(W - sumWeight) / goods.weight * goods.value;
                sumWeight = W;
                if (check < tempAns) {
                    return tempAns;// 終端
                }
                int[] nex1 = fix.clone();
                nex1[i] = -1;
                tempAns = solve(nex1, tempAns, deep+1);
                int[] nex2 = fix.clone();
                nex2[i] = 1;
                tempAns = solve(nex2, tempAns, deep+1);
                return tempAns;// 分岐
            }
        }
        if (z > tempAns) {
            tempAns = z;
            // System.out.println(tempAns);
            return tempAns;// 更新
        }
        return tempAns;// 終端
        // System.out.println(z + " " + sumWeight);
    }
}

class Goods {
    final int weight;
    final int value;
    final double costperformance;

    Goods(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.costperformance = (double) value / weight;
    }

    public double getCostperformance() {
        return costperformance;
    }

    @Override
    public String toString() {
        return weight + ":" + value + ":" + costperformance;
    }
}