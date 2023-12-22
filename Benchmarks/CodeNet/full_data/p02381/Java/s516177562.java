import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try (java.util.Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0){break;}
                int[] scores = new int[n];
                for(int i=0; i < scores.length; i ++){
                    scores[i] = sc.nextInt();
                }
                double average = 0, variance = 0;
                int sum = 0;
                for(int i=0; i < scores.length; i ++){
                    sum += scores[i];
                }
                average = (double)sum / n;
                double var = 0;
                for(int i=0; i<scores.length; i ++){
                    var += Math.pow(scores[i] - average, 2);
                }
                variance = var/n;
                System.out.println(String.format("%.8f",Math.sqrt(variance)));
            }
            sc.close();
        } 
    }
}
