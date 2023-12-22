import java.util.Scanner;

public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       Long result = 1L;
       for(int i = 0; i<n; i++){
            result = result *  sc.nextLong();
       }
       if(result > (int) Math.pow(10, 18)){
           System.out.println(-1);
       }
       else{
           System.out.println(result);
       }
    }
}