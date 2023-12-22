
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int h=x/60/60;
        int m=x/60%60;
        int s=x%60;
        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}

