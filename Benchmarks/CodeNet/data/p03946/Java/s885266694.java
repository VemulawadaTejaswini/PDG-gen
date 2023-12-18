


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int [] prices = new int [N];

        for(int i=0;i<N;i++){
            prices[i]=sc.nextInt();
        }

        int max = 0;
        int max_cnt = 0;
        int max_pos =-1;

        for(int i=0;i<N;i++){
            if(i<max_pos){
                if (prices[max_pos] - prices[i] > max) {
                    max = prices[max_pos] - prices[i];
                    max_cnt = 1;
                }
            }
            else {
                for (int j = i + 1; j < N; j++) {
                    if (prices[j] - prices[i] == max) {
                        max_cnt++;
                        max_pos = j;
                    } else if (prices[j] - prices[i] > max) {
                        max = prices[j] - prices[i];
                        max_cnt = 1;
                        max_pos = j;
                    }
                }
            }
        }

        System.out.println(max_cnt);

        sc.close();

    }

}
