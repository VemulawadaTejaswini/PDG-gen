import java.util.Scanner;

public class Main{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(true){
            i++;
            int x = sc.nextInt();
            if(x==0) break;
            else System.out.println("Case "+i+": "+x);
        }
    }
}
