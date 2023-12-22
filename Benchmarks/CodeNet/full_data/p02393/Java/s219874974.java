import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int swap;
        
        if(a>b){
            swap=a;
            a=b;
            b=swap;
        }
        if(b>c){
            swap=b;
            b=c;
            c=swap;
        }
        if(a>b){
            swap=a;
            a=b;
            b=swap;
        }
        System.out.println(a +" "+ b +" "+ c);
    }
}
