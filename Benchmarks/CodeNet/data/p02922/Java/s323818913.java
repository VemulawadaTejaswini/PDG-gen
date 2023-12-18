import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String[] AB = sc.nextLine().split(" ");
        
        int A = Integer.valueOf(AB[0]);
        int B = Integer.valueOf(AB[1]);
        
        int hantei = A * (B / A);
        int count = B / A;

        if (hantei < B) {
            count++;
            
        }
        System.out.println(count);
    }
}