import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(helper(a,b));
    }
    public helper(int a, int b){
       if(a ==0){
         return b;     
       } else {
         return  helper(b % a, a);
       }
    }
}
