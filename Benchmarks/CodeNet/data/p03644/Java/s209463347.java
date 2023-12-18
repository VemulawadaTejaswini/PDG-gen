import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        while(n>=answer){
            answer *= 2;
        }
        System.out.println(answer/2);
    }
}