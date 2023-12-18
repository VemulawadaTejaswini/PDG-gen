import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        char[] A = S.toCharArray();

        int count = 0;
        int sum[] = new int[N+1];

        for(int i = 1; i <= N;i++){
			count = 0;

            for(int n = 0;n < i;n++){
                if(A[n] == 'W'){
                    count++;
                }
            }

            for(int reader = i + 1; reader < N; reader++){
                if(A[reader] == 'E'){
                    count++;
                }
            }

            sum[i] = count;
           
        }

        int min = 999999;
            for(int i = 1;i <= N;i++){
                int n = sum[i];
                if(n < min){
                min = n;
                }
            }

        System.out.println(min);
    }
}
