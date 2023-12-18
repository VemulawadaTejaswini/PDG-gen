import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kennzya on 2017/09/30.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int lowNumber= sc.nextInt();
        int score = sc.nextInt();
        for(int i = 1;i < count ;i++){
            int tmpNumber = sc.nextInt();
            int tmpScore = sc.nextInt();
            if(tmpNumber > lowNumber){
                lowNumber = tmpNumber;
                score = tmpScore;
            }
        }

        System.out.println(lowNumber + score);
    }
}
