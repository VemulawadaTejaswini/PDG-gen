import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] guusuukou = new int[100001];
        int[] kisuukou = new int[100001];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (i % 2 == 0) {
                guusuukou[array[i]] += 1;
            } else {
                kisuukou[array[i]] += 1;
            }
        }
        
        int guusuukouModeValue = 0;
        int kisuukouModeValue = 0;
        
        for (int i = 0; i < 100001; i++) {
            if (guusuukou[i] > guusuukouModeValue) {
                guusuukouModeValue = guusuukou[i];
            }
            if (kisuukou[i] > kisuukouModeValue) {
                kisuukouModeValue = kisuukou[i];
            }
        }
        
        int countToFix = n - guusuukouModeValue - kisuukouModeValue;
        System.out.println(countToFix);
        
    }
}