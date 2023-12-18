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
        new knapsackSolver(list, W);
    }
}

class knapsackSolver {
    ArrayList<Goods> list = new ArrayList<Goods>();
    int W;

    knapsackSolver(ArrayList<Goods> list, int W) {
        this.list = list;
        this.W = W;
        list.sort(Comparator.comparing(Goods::getCostperformance).reversed());
        System.out.println(solve(new int[list.size()], 0L));
    }

    long solve(int[] fix, long tempAns) {
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
                    return tempAns;// 更新
                }
                return tempAns;// 終端
            } else {
                double check = z + (double) (W - sumWeight) / goods.weight * goods.value;
                sumWeight = W;
                if (check < tempAns) {
                    return tempAns;// 終端
                }
                int[] nex = fix.clone();
                nex[i] = 1;
                tempAns = solve(nex, tempAns);
                nex[i] = -1;
                tempAns = solve(nex, tempAns);
                return tempAns;// 分岐
            }
        }
        if (z > tempAns) {
            tempAns = z;
            return tempAns;// 更新
        }
        return tempAns;// 終端
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