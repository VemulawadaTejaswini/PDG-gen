import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = a + b;
        int sumsum = a + c;
        int sumsumsum = b + c;

        if(sum <= sumsum && sum <= sumsumsum){
            System.out.println(sum);   
        }else if(sumsum <= sum && sumsum <= sumsumsum){
            System.out.println(sumsum);
        }else if(sumsumsum <= sum && sumsumsum <= sumsum){ 
            System.out.println(sumsumsum);
        }


    }
}