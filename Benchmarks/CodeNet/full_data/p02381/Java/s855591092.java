import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] score;
        score = new int[100];
        int i, sum = 0;
        double a, m, sum2 = 0.0;

        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n==0){break;}
            else{
                for(i=0;i<n;i++){
                    score[i] = sc.nextInt();
                    sum = sum + score[i];
                }
                m = (double)(sum / n);

                for(i=0;i<n;i++){
                    sum2 = (double)(sum2 + (score[i] - m)*(score[i] - m));
                }
                a = (double)(sum2 / n);

                System.out.println(Math.sqrt(a));

                sum = 0;
                sum2 = 0;
            }
        }
    }
}
