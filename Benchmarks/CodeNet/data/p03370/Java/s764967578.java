import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int have = sc.nextInt();
        int[] array = new int[num];
        int min = 1001;
        int minIndex = -1;
        int count = -1;

        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            array[i] = a;
            if(a < min){
                min = a;
                minIndex = i;
            }
            have -= a;
            count++;
        }

        while(have >= 0){
            have -= array[minIndex];
            count++;
        }

        System.out.println(count);
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
