import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String[] b = a.split(" ");
       int numA = Integer.parseInt(b[0]);
       int numB = Integer.parseInt(b[1]);
       if(numA <= 8 && numB <= 8){
           System.out.println("Yey!");
       } else {
           System.out.println(":(");
       }
    }
}