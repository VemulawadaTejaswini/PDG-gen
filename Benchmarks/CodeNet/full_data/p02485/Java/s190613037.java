import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 while (true){
             int n = sc.nextInt();
             int sum=0;
             while(true){
                 sum += n%10;
                 n = n/10;
                 if(n < 1)break;
             }
             System.out.println(sum);    
         }
       
    }
}