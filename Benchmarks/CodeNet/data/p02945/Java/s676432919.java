import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = a + b;
        int sum2 = a - b;
        int sum3 = a * b;
        
        if(sum1 >= sum2 && sum1 >= sum3){
            System.out.print(sum1);            
        }
        else if(sum2 >= sum1 && sum2 >= sum3){
            System.out.print(sum2);
        }
        else if(sum3 >= sum1 && sum3 >= sum2){
            System.out.print(sum3);
        }
        
    }
}