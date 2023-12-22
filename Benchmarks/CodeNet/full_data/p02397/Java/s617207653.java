import java.util.Scanner;

public class Main {
static   Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
        int x,b;
        while(true){
            x=scan.nextInt(); b=scan.nextInt();
            if (x == 0 && b == 0){
                break;
            }
            if(x>b){
                System.out.printf("%d %d\n",b,x);
            }else{
                  System.out.printf("%d %d\n",x,b);
            }
        }
        
    }
}
