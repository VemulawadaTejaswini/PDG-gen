import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        
        long[] array = new long[4];
        
        array[0] = a * d;
        array[1] = b * c;
        array[2] = a * c;
        array[3] = b * d;
        
        long max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println(max);
                
    }
}