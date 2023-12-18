import java.util.*;

public class Main {
    public static void main(String[] args) {
        // int[] initial = {9,1,8,7,2,6,5,4,3};
        // int[] initial = {1,2,3,4,5};
        // NextPermutationIterator it = new NextPermutationIterator(initial);
        // int[] permutation = it.getCurrentPermutaion();
        // printArray(permutation);
        // int count = 1;
        // // while (it.hasNext()) {
        //     permutation = it.next();
        //     printArray(permutation);
        //     count ++;
        // }
        // // printArray(permutation);
        // System.out.print(count);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R];
        for(int i = 0; i < R; i++) {
            r[i] = sc.nextInt();
        }
        int[][] dp = new int[N+1][N+1];
        for(int i = 0; i < N+1; i++) {
            for(int j = 0; j < N+1; j++) {
                if (i==j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[a][b] = c;
            dp[b][a] = c;
        }
        //Floyd-Warshall
        for(int k=1; k < N+1; k++) {
            for(int i=1; i<N+1; i++) {
                for(int j=1; j<N+1; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }
        //relevant distances
        int[][] relevant = new int[R][R];
        for (int i=0; i<R; i++) {
            for (int j=0; j<R; j++) {
                relevant[i][j] = dp[r[i]][r[j]];
            }
        }
        //answer
        int answer = Integer.MAX_VALUE;
        NextPermutationIterator it = new NextPermutationIterator(0, R);
        int[] perm = it.getCurrentPermutaion();
        answer = Math.min(answer, solveForPerm(perm, relevant));
        while(it.hasNext()) {
            perm = it.next();
            answer = Math.min(answer, solveForPerm(perm, relevant));
        }
        System.out.println(answer);
    }
    private static int solveForPerm(int[] perm, int[][] distance){
        int ans = 0;
        for(int i=0; i<perm.length-1; i++) {
            ans += distance[perm[i]][perm[i+1]];
        }
        return ans;
    }
    private static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static class NextPermutationIterator implements Iterator {
        private int[] currentPermutation;
        private int length;

        public NextPermutationIterator(int start, int end) {
            this.currentPermutation = new int[end - start];
            for (int i = start; i < end; i++) {
                currentPermutation[i - start] = i;
            }
            length = end - start;
        }

        public NextPermutationIterator(int[] initialPermutation) {
            this.currentPermutation = initialPermutation;
            length = initialPermutation.length;
        }

        public int[] getCurrentPermutaion() {
            return currentPermutation;
        }

        public boolean hasNext() {
            int lastAscendingIndex = -1;
            for (int i = 0; i < length - 1; i++) {
                if (currentPermutation[i] < currentPermutation[i + 1]) {
                    lastAscendingIndex = i;
                }
            }
            if (lastAscendingIndex != -1) {
                return true;
            } else {
                return false;
            }
        }

        private void print(String message) {
            System.out.println(message);
            for (int i = 0; i < this.currentPermutation.length; i++) {
                System.out.print(currentPermutation[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        private void print(String message, int value) {
            System.out.print(message);
            System.out.print(" = ");
            System.out.println(value);
        }

        public int[] next() {
            int lastAscendingIndex = -1;
            // print("next() start");
            for (int i = 0; i < length - 1; i++) {
                if (currentPermutation[i] < currentPermutation[i + 1]) {
                    lastAscendingIndex = i;
                }
            }
            // print("lastAcendingIndex", lastAscendingIndex);
            if (lastAscendingIndex == -1) {
                Arrays.sort(currentPermutation);
                return currentPermutation;
            }
            // Decsending: lAI + 1....
            // At least one elem larger than c[lAI]
            // reverse right part
            int[] tmp = new int[length];
            int reverseLength = length - (lastAscendingIndex + 1);
            // print("reverseLength", reverseLength);
            for (int i = 0; i < reverseLength; i++) {
                tmp[i] = currentPermutation[lastAscendingIndex + 1 + i];
            }
            for (int i = 0; i < reverseLength; i++) {
                currentPermutation[lastAscendingIndex + 1 + i] = tmp[reverseLength - 1 - i];
            }
            // print("reversed.");
            // reversed
            // swap the minimal element in right-part which is larger than
            // current[lastAscendingIndex]
            int minimalIndex = -1;
            int minimalValue = Integer.MAX_VALUE;
            for (int i = 0; i < reverseLength; i++) {
                if (currentPermutation[i + 1 + lastAscendingIndex] > currentPermutation[lastAscendingIndex]) {
                    if (currentPermutation[i + 1 + lastAscendingIndex] < minimalValue) {
                        minimalIndex = i + 1 + lastAscendingIndex;
                        minimalValue = currentPermutation[i + 1 + lastAscendingIndex];
                    }
                }
            }
            // swap
            // print("minimalIndex", minimalIndex);
            // print("minimalValue", minimalValue);
            int tmpvalue = currentPermutation[lastAscendingIndex];
            currentPermutation[lastAscendingIndex] = currentPermutation[minimalIndex];
            currentPermutation[minimalIndex] = tmpvalue;
            // print("swapped.");
            return currentPermutation;
        }

    }
}