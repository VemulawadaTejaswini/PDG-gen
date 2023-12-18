import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        int b=scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int c=scan2.nextInt();
        
        if(a+b==c||a+c==b||b+c==a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}