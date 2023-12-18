import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextLong();
        double h = sc.nextLong();
        double x = sc.nextLong();
        double y = sc.nextLong();
        int multipleAnswer = 0;
        double answer = 0;
        if(x == y && w == h){
            multipleAnswer = 1;
            answer = (w - x) * h;
        }else{
            double answer1 = (w - x) * h;
            double answer2 = (h - y) * w;
            if(answer1 > answer2){
                answer = answer1;
            }else if(answer1 == answer2){
                answer = answer1;
                multipleAnswer = 1;
            }else{
                answer = answer2;
            }
        }
        System.out.print(answer+" ");
        System.out.println(multipleAnswer);
    }
}