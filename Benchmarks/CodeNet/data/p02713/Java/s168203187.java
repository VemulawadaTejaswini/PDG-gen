import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    sum += gcd3(i,j,k);
                }
            }
        }
        System.out.println(sum);
    }

    public static int gcd(int a, int b){
        if(b == 0){return a;}
        return gcd(b, a%b);
    }

    public static int gcd3(int x, int y, int z){
        int xy = gcd(x,y);
        return gcd(xy,z);
    }
}