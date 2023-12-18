import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        
        long power = 1;
        double pow = Math.pow(10, 9);
        int pow2 = (int)pow;
        
        for(int i = 1; i <= line; i++){
        	
        	power *= i;
        	power = power%(pow2+7);
        	
        }
        
        System.out.println(power);
        
        
        
    }
}