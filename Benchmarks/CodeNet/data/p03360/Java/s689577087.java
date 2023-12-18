import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int max = Math.max(a, b);
        max = Math.max(max, c);
        int sum = 0;

        if(max == a){
            for(int i=0; i<n; i++){
                a*=2;
            }
        } else if(max == b){
            for(int i=0; i<n; i++){
                b*=2;
            }
        } else {
            for(int i=0; i<n; i++){
                c*=2;
            }
        }

        sum = a + b + c;
        System.out.println(sum);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
