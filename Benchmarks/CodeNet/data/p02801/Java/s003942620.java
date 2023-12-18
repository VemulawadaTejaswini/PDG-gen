import java.util.*;
public class Main{
public static void main(String gg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int scores[] = new int[n-1];
        int sum = 0;
        for(int i = 0; i<scores.length; i++){
            scores[i] = sc.nextInt();
            sum = sum + scores[i];
        }
        int finalScore = (m * n) - sum;
        if(sum/n >= m){
            System.out.println("0");
        }
        if(finalScore>k){
            System.out.println("-1");
        }else {
            System.out.println(finalScore);
        }
    }
}