import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0) break;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
