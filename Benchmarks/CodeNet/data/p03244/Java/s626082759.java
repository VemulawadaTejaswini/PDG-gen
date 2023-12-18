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
        int guusuukouMode2 = -1;
        int guusuukouModeValue2 = 0;
        int kisuukouMode1 = 0;
        int kisuukouModeValue1 = 0;
        int kisuukouMode2 = -1;
        int kisuukouModeValue2 = 0;
        
        for (int i = 1; i < 100001; i++) {
            if (guusuukou[i] > guusuukouModeValue1) {
                if (guusuukouMode1 != 0) {
                    guusuukouMode2 = guusuukouMode1;
                    guusuukouModeValue2 = guusuukouModeValue1;
                }
                guusuukouMode1 = i;
                guusuukouModeValue1 = guusuukou[i];
            } else if (guusuukou[i] > guusuukouModeValue2) {
                guusuukouMode2 = i;
                guusuukouModeValue2 = guusuukou[i];
            }
            if (kisuukou[i] > kisuukouModeValue1) {
                if (kisuukouMode1 != 0) {
                    kisuukouMode2 = kisuukouMode1;
                    kisuukouModeValue2 = kisuukouModeValue1;
                }
                kisuukouMode1 = i;
                kisuukouModeValue1 = kisuukou[i];
            } else if (kisuukou[i] > kisuukouModeValue2) {
                kisuukouMode2 = i;
                kisuukouModeValue2 = kisuukou[i];
            }
        }
        
        int a;
        int b;
        
        if (guusuukouMode1 == kisuukouMode1) {
            if (guusuukouModeValue1 > kisuukouModeValue1) {
                a = guusuukouModeValue1;
                b = kisuukouModeValue2;
            } else {
                a = guusuukouModeValue2;
                b = kisuukouModeValue1;
            }
        } else {
            a = guusuukouModeValue1;
            b = kisuukouModeValue1;
        }
        
        int countToFix = n - a - b;
        System.out.println(countToFix);
        
    }
}
