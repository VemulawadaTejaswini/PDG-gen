

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

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(prices[j]-prices[i]==max){
                    max_cnt++;
                }
                else if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                    max_cnt=1;
                }


            }
        }

        System.out.println(max_cnt);

        sc.close();

    }

}
