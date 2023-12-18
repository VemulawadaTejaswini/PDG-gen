import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String[] b = a.split(" ");
       int numA = Integer.parseInt(b[0]);
       int numB = Integer.parseInt(b[1]);
       if(numA == 0){
           System.out.println(numB);
       } else if(numA == 1 || numB == 100){
           System.out.println(numB * 100);
       } else if(numA == 2){
           System.out.println(numB * 100 * 100);
       }
    }
}