import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
        2<=N<=200
        2<=R<=min(8,N)
        M<=N*(N-1)/2
        1<=Ci<=100000
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R];
        for(int i=0; i<R; i++) {
            r[i] = sc.nextInt();
        }
        //set dp table, initialize to INFINITE, and update according to path information
        int[][] dp  = new int[N+1][N+1]; //not using 0 index
        int INF = Integer.MAX_VALUE;
        for(int i=0; i<N+1; i++) {
            for(int j=0; j<N+1; j++) {
                if (i==j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = INF;
                }
            }
        } 
        //update according to path informations
        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[a][b] = c;
            dp[b][a] = c;
        }
        //Floyd-Warshall Algorithm;
        //ignore 0th index
        for(int k=1;k<N+1;k++) {
            for(int i=1;i<N+1;i++){
                for(int j=1;j<N+1;j++) {
                    dp[i][j] = Math.min(dp[i][k] + dp[k][j], dp[i][j]);
                }
            }
        }


        // System.out.println("DPTABLE");
        // for (int i=1;i<N+1;i++) {
        //     for (int j=1;j<N+1;j++) {
        //         // System.out.print(dp[i][j]);
        //         // System.out.print(",");
        //     }
        //     // System.out.println("");
        // }
        // //seartch for answer by dfs-like procedure
        //calculate answer of starting on r th town, and get minimal one.
        int[][] relevantDistance = new int[R][R];
        // System.out.println("Relevant distances");
        for (int i=0; i<R; i++) {
            int Ri = r[i];
            for (int j=0; j<R; j++) {
                if(i==j) {
                    relevantDistance[i][j] = 0;
                    continue;
                }
                int Rj = r[j];
                relevantDistance[i][j] = dp[Ri][Rj];
            }
            // System.out.println("");
        }
        int[] a = new int[R];
        for(int i=0; i<R; i++) {
            a[i] = i;
        }
        int answer = Integer.MAX_VALUE;
        int permutaionNum = perm_num(R);
        // System.out.println(permutaionNum);
        for (int i=0; i<permutaionNum*2; i++) {
            int candidate = 0;
            for(int k=0; k<R-1; k++) {
                candidate += relevantDistance[a[k]][a[k+1]];
            }
            answer = Math.min(answer,candidate);
            next_permutation(a);
        }
        //Output
        System.out.println(answer);
    }

    private static int perm_num(int x) {
        if (x==0) {
            return 1;
        }
        return(x*perm_num(x-1));
    }


    private static void next_permutation(int[] current_permutation) {
        // System.out.println("argument");
        // printArray(current_permutation);
        int lastAscendingIndex = -1;
        int length = current_permutation.length;
        for(int i=0; i<length-1; i++) {
            if(current_permutation[i] < current_permutation[i+1]) {
                lastAscendingIndex = i;
            }
        }
        //lastAscendingIndex -> descending afterwards
        if (lastAscendingIndex == -1) {
            // System.out.println("No acsending part");
            Arrays.sort(current_permutation);
            // printArray(current_permutation);
            return;
        }
        //reverse decending part
        int reverseStartIndex = lastAscendingIndex + 1;
        int reverseLength = length - reverseStartIndex;
        int[] tmp = new int[reverseLength];
        for(int i=0; i<reverseLength; i++) {
            tmp[i] = current_permutation[reverseStartIndex + i];
        }
        for(int i=0; i<reverseLength; i++) {
            current_permutation[reverseStartIndex + i] = tmp[reverseLength - 1 - i];
        }
        // System.out.println("after reversal");
        // printArray(current_permutation);
        //swap minimal one
        int minimalOne = Integer.MAX_VALUE;
        int swap = -1;
        for(int i=reverseStartIndex; i<length; i++) {
            if (current_permutation[i] > current_permutation[lastAscendingIndex]) {
                if(current_permutation[i] < minimalOne) {
                    swap = i;
                    minimalOne = current_permutation[i];
                }
            }
        }
        // System.out.println(lastAscendingIndex);
        // System.out.println(reverseStartIndex);
        // System.out.println(swap);
        swap(current_permutation, lastAscendingIndex, swap);
        // System.out.println("after swap");
        // printArray(current_permutation);
        // System.out.println("--------");
    }

    private static void printArray(int [] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
