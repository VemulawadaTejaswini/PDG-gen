import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     for(int i = 1;i <= 10000;i++){
         int x = scan.nextInt();
         if(x == 0){
             i = 10001;
         }else{
             System.out.println("Case " + i + ": " + x);
         }
     }
    }
}
