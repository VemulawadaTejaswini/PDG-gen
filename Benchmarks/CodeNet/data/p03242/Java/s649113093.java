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
        
        int guusuukouMode1 = 0;
        int guusuukouModeValue1 = 0;
        int guusuukouMode2 = 0;
        int guusuukouModeValue2 = 0;
        int kisuukouMode1 = 0;
        int kisuukouModeValue1 = 0;
        int kisuukouMode2 = 0;
        int kisuukouModeValue2 = 0;
        
        for (int i = 1; i < 100001; i++) {
            if (guusuukou[i] > guusuukouModeValue1) {
                guusuukouMode2 = guusuukouMode1;
                guusuukouModeValue2 = guusuukouModeValue1;
                guusuukouMode1 = i;
                guusuukouModeValue1 = guusuukou[i];
                
            } else if (guusuukou[i] > guusuukouModeValue2) {
                guusuukouMode2 = i;
                guusuukouModeValue2 = guusuukou[i];
            }
            
            if (kisuukou[i] > kisuukouModeValue1) {
                kisuukouMode2 = kisuukouMode1;
                kisuukouModeValue2 = kisuukouModeValue1;
                kisuukouMode1 = i;
                kisuukouModeValue1 = kisuukou[i];
                
            } else if (kisuukou[i] > kisuukouModeValue2) {
                kisuukouMode2 = i;
                kisuukouModeValue2 = kisuukou[i];
            }
        }
        
        int a;
        int b;
        
        if (guusuukouMode1 != kisuukouMode1) {
            a = guusuukouModeValue1;
            b = kisuukouModeValue1;
        } else {
            int a1 = guusuukouModeValue2;
            int b1 = kisuukouModeValue1;
            int a2 = guusuukouModeValue1;
            int b2 = kisuukouModeValue2;
            
            if (a1 + b1 > a2 + b2) {
                a = a1;
                b = b1;
            } else {
                a = a2;
                b = b2;
            }
        }
        
        int countToFix = n - a - b;
        System.out.println(countToFix);
    }
}
