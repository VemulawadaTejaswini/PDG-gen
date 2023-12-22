import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                int a=0;
                if(n==0){ break; }
                int[] scores = new int[n];
                for(int i=0; i<scores.length;i++){
                    scores[i] = sc.nextInt();
                    a=a+scores[i];
                }
                double average = 0.0;
                double variance = 0.0;
                average = (double)a/n;
                for(int i=0;i<scores.length;i++) {
                    variance = variance + (scores[i] - average) * (scores[i] - average);
                }
                variance=variance/n;
                System.out.println(Math.sqrt(variance));
            }
        }
    }
}

