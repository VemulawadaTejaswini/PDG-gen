import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
      
        int sum = A + B;
        int difference = A - B;
        int product = A * B;
        
        //上記の最大値を出力
        System.out.println(Math.max(product, Math.max(sum, difference)));
    }
}