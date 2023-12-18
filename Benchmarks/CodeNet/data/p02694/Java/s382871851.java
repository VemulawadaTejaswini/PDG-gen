import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       long f = 100;
       int answer = 0;
       long x = sc.nextLong();
       while(x > f){
           f += f / 100;
           answer++;
       }
       System.out.println(answer); 
    }
}