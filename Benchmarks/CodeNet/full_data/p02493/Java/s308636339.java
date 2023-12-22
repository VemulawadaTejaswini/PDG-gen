import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] aArray = new int[n];
        int i;
        
        for(i = 0; i < n; i++) {
            aArray[i] = scanner.nextInt();
        }
        
        reverseIntArray(aArray);
        
        for(i = 0; i < n - 1; i++) {
            System.out.print(aArray[i] + " ");
        }
        System.out.println(aArray[n-1]);
    }
    
    public static void reverseIntArray(int[] array) {
        int[] temp = (int []) array.clone();
        int i, j;
        j = array.length - 1;
        
        for(i = 0; i < array.length; i++) {
            array[i] = temp[j];
            j--;
        }
    }
}