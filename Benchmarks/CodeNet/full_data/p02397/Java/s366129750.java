import java.util.Scanner;


public class Main{
    public static void swap(int c, int d){
        int a, b;
        a = c;
        b = d;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a ==0 && b == 0){
            break;
            }
            else if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println( a+" "+b);
        }

    }
    
}
