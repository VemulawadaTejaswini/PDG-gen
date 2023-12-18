import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a + b == c){
            System.out.println("Yes");
        }else if(b + c == a){
            System.out.println("Yes");
        }else if(a + c == b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}