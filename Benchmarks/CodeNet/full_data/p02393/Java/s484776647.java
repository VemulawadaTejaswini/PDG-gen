import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = 0;
        
        if(a > b){
            s = a;
            a = b;
            b = s;
        }
        if(b > c){
            s = b;
            b = c;
            c = s; 
        }
        if(a > b){
            s = a;
            a = b;
            b = s; 
        }
        System.out.println(a + " " + b + " " + c);
    }
}
