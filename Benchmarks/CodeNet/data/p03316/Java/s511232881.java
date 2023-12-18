import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] nCharArray = String.valueOf(n).toCharArray();
        int nSum = 0;
        for(char c: nCharArray){
            int i = Integer.parseInt(String.valueOf(c));
            nSum += i;
        }
        if(n % nSum == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
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
