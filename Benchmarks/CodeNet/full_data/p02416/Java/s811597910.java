import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String x = sc.next();

            if(x.equals("0"))break;

            int sum = 0 ,i;

            for(i = 0;i < x.length();i++){
                sum = sum + x.charAt(i) - 48;
            }
            
            System.out.printf("%d\n",sum);
            
        }
    }
}
