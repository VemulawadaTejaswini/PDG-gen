package org.zlambda.sandbox.puzzle;

/**
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DPL_1_C

Knapsack Problem

You have N kinds of items that you want to put them into a knapsack. Item i has value vi and weight wi.

You want to find a subset of items to put such that:

The total value of the items is as large as possible.
The items have combined weight at most W, that is capacity of the knapsack.
You can select as many items as possible into a knapsack for each kind.
Find the maximum total value of items in the knapsack.

Input
N W
v1 w1
v2 w2
:
vN wN
The first line consists of the integers N and W. In the following lines, the value and weight of the i-th item are given.

Output
Print the maximum total values of the items in a line.

Constraints
1 ??? N ??? 100
1 ??? vi ??? 1000
1 ??? wi ??? 1000
1 ??? W ??? 10000
Sample Input 1
4 8
4 2
5 2
2 1
8 3
Sample Output 1
21

Sample Input 2
2 20
5 9
4 10
Sample Output 2
10

Sample Input 3
3 9
2 1
3 1
5 2
Sample Output 3
27
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public int solve(int W, List<Integer> weights, List<Integer> values) {
        int N = values.size();
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= W; ++j) {
                int w = weights.get(i - 1);
                if (j >= w) {
                    dp[j] = Math.max(dp[j], dp[j - w] + values.get(i - 1));
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> weights = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        List<Integer> NW = Stream.of(scanner.nextLine().split("\\s")).map(Integer::valueOf)
                                      .collect(Collectors.toList());
        final int N = NW.get(0);
        final int W = NW.get(1);
        for (int i = 0; i < N; ++i) {
            List<Integer> collect = Stream.of(scanner.nextLine().split("\\s")).map(Integer::valueOf)
                                          .collect(Collectors.toList());
            values.add(collect.get(0));
            weights.add(collect.get(1));
        }
        System.out.println(new Main().solve(W, weights, values));
    }
}