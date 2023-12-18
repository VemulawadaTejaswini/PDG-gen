import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        Collections.sort(list);
        new knapsackSolver(list, W);
    }
}

class knapsackSolver {
    int tempAns = 0;
    ArrayList<Goods> list = new ArrayList<Goods>();
    int W;

    knapsackSolver(ArrayList<Goods> list, int W) {
        this.list = list;
        this.W = W;
        // System.out.println(Arrays.toString(list.toArray()));
        solve(new int[list.size()]);
        System.out.println((int) tempAns);
    }

    void solve(int[] fix) {
        // System.out.println(Arrays.toString(fix));
        int z = 0;
        int sumWeight = 0;

        for (int i = 0; i < list.size(); i++) {
            if (fix[i] == 1) {
                Goods goods = list.get(i);
                z += goods.value;
                sumWeight += goods.weight;
            }
        }
        if (sumWeight > W)
            return;
        else if (z > tempAns)
            tempAns = z;

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
                }
                break;
            } else {
                if (z > tempAns) {
                    tempAns = z;
                }
                double check = z + (W - sumWeight) / goods.weight * goods.value;
                sumWeight += (W - sumWeight) / goods.weight;
                if (check < tempAns) {
                    break;
                }
                int[] nex = fix.clone();
                nex[i] = 1;
                solve(nex);
                nex[i] = -1;
                solve(nex);
                break;
            }
        }
        // System.out.println(z + " " + sumWeight);
    }
}

class Goods implements Comparable {
    final int weight;
    final int value;
    final float costperformance;

    Goods(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.costperformance = (float) value / weight;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods target = (Goods) o;
            float diff = target.costperformance - this.costperformance;
            if (diff == 0)
                return 0;
            else if (diff > 0)
                return 1;
            else
                return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return weight + ":" + value + ":" + costperformance;
    }
}