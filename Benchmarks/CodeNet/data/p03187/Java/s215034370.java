package atcoder_tree;

import java.util.Scanner;

public class Main {
    // 0 counter clockwise
    // 1 clockwise
    static int dp[][];
    static int tree[];
    static int l;
    static int greatest_distance(int cur_index,int clock_tree, int counter_tree)
    {
        if(clock_tree > counter_tree)
            return 0;
        if(dp[clock_tree][counter_tree]!=-1)
        {
            return dp[clock_tree][counter_tree];
        }
        if(cur_index < clock_tree) {
            int a = greatest_distance(clock_tree, clock_tree + 1, counter_tree)
                    + tree[clock_tree] - tree[cur_index];

            int b = greatest_distance(counter_tree, clock_tree, counter_tree - 1)
                    + l-tree[counter_tree] + tree[cur_index];
            dp[clock_tree][counter_tree] = (a>b)?a:b;


            return dp[clock_tree][counter_tree];
        }
        else
        {
            int a = greatest_distance(clock_tree, clock_tree + 1, counter_tree)
                    + tree[clock_tree] + l - tree[cur_index];

            int b = greatest_distance(counter_tree, clock_tree, counter_tree - 1)
                    - tree[counter_tree] + tree[cur_index];
            dp[clock_tree][counter_tree] = (a>b)?a:b;

            return dp[clock_tree][counter_tree];


        }

    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n;
        l=input.nextInt();
        n=input.nextInt();
        dp=new int[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j]=-1;
            }
        }

        tree=new int[n+1];
        tree[0]=0;
        for (int i = 1; i < tree.length; i++) {
            tree[i] = input.nextInt();
        }
        int counter_tree = 1;
        int clock_tree = n;
        int ans = greatest_distance(0,1,n);
        System.out.println(ans);




    }
}
