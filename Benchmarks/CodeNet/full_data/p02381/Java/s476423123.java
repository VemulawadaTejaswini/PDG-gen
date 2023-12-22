import java.util.Scanner;

public class Main{
public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)){
        double average = 0, variance = 0,total = 0,total2 = 0;
        while(true){
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            int[] scores = new int[n];
            for(int i =0;i < scores.length;i++){
                scores[i] = sc.nextInt();
                total += scores[i];
            }
            average = total / n;
            for(int i = 0; i < scores.length;i++) {
                total2 += (scores[i] - average) * (scores[i] - average);
                variance = total2 / scores.length;
            }
            System.out.println(Math.sqrt(variance));
        }
