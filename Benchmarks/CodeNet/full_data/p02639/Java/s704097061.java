import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=4*a;
        int e=b%2;
        int f=2*a;
        if(e==0){
            while(true){
                if(d==b){
                    System.out.println("Yes");
                    break;
                }else if(d<f){
                    System.out.println("No");
                    break;
                }
                d=d-2;
            }           
        }else{
            System.out.println("No");
        }
    }
}
