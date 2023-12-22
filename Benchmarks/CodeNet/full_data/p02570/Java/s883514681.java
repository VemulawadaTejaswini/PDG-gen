import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextInt();
        double t=sc.nextInt();
        double s=sc.nextInt();
        double ans=d/s;
        System.out.println(ans);
        if(ans<=t){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
