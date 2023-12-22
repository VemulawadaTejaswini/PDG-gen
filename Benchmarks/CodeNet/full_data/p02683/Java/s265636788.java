import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();

        int[][] list = new int[N][M+1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                list[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int okane = 0;
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < Math.pow(2, N); i++) {
            int[] abi = new int[M];
            String bit = Integer.toBinaryString(i);

            for (int j = bit.length()-1; j >= 0 ;  j--) {
                if (bit.charAt(j) == '1') {
                    okane += list[bit.length()-1-j][0];
                    for (int k = 0; k < M; k++) {
                        abi[k] += list[bit.length()-1-j][k+1];
                    }
                }
            }

            if (check(abi,X) && okane <= ans) { ans = id(okane);; }
            okane = 0;

        }
        if(ans == Integer.MAX_VALUE) {ans = -1;}
        System.out.println(ans);
    }

    static int id(int i) {
        return i;
    } 

    static boolean check (int[] k,int x) {
        for (int i = 0; i < k.length; i++) {
            if (k[i] < x) {
                return false;
            }
        }
        return true;
    }
}