import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0 && array[i] % 5 != 0) {
                System.out.println("DENIED");
                return;
            }
        }
        
        System.out.println("APPROVED");
        
    }
} 