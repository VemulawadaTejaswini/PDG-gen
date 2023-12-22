import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(X==1 && (Y==2||Y==4))System.out.println("Yes");
        int rem=Y%4;
        if(rem==0||rem==2)System.out.println("Yes");
        else
        System.out.println("No");
    }
}