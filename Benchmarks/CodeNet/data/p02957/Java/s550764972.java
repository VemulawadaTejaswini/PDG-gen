import java.util.Scanner;
public class a{
        public  static int main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c;
                if((a+b)%2==0){
                        c=(a+b)/2;
                        return c;
                }else{
                        System.out.println("IMPOSSIBLE");
                }
                return 0;
        }
}