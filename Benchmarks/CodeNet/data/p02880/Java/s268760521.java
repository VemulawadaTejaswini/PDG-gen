import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        Integer num = scan.nextInt();
        String msg= "No";
    
        if(num > 81){
            System.out.println("No");
        }
        else if (1<=num && num<=9){
            System.out.println("Yes");            
        }
        else{
            for(int i=2;i<=9;i++){
                int d = num % i;
                int e = num / i;
                if(d==0 && 1<=e && e<=9){
                    msg ="Yes";
                    break;                    
                }
            }
        }
        System.out.println(msg);
        scan.close();
    }
}