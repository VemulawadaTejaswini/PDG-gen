import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println((int)(Math.pow(2, Math.ceil(Math.log(k)/Math.log(2)))+k*(n-Math.ceil(Math.log(k)/Math.log(2)))));
    }
 
    
}