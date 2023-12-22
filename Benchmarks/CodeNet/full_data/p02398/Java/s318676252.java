
import java.util.Scanner;


public class Main {
static   Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
        int a,b,c;
        int temp = 0;
        a=scan.nextInt();b=scan.nextInt();c=scan.nextInt();
        for(int i = a; i<=b;i++){
            if(c % i == 0){
                temp++;
            }
        }
        System.out.println(temp);
    }
    
}
