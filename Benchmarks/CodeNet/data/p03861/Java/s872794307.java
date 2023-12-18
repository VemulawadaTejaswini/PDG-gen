import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long answer = (b-a)/n;
        if(b % n == 0){
            answer++;
        }
        System.out.println(answer);
    }
}