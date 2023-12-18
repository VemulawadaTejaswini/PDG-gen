import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        if(a!=b) System.out.println("Yes");
        else{
            c=scan.nextInt();
            if(a!=c) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}