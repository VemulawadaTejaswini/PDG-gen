import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int a = s.nextInt();
                int sum = 0;
                for(int i = 0; i < a; i++){
                    for(int j = 0; j < a; j++){
                        for(int k = 0; k < a; k++){
                            sum = sum + gcd(gcd(i+1,j+1),k+1);
                        }
                    }
                }
                System.out.println(sum);
    }
    public static int gcd(int a, int b){
        int tmp;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }
        return b;
    }
}