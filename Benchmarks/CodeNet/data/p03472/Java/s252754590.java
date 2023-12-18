import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hp = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        a[0] = sc.nextInt();
        b[0] = sc.nextInt();
        int aMaxDamage = a[0];
        int aMaxIndex = 0;
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            
            if (a[i] > aMaxDamage) {
                aMaxDamage = a[i];
                aMaxIndex = i;
            } else if (a[i] == aMaxDamage) {
                if (b[i] > b[aMaxIndex]) {
                    aMaxIndex = i;
                }
            }
        }
        
        Arrays.sort(b);
        int count = 0;
        
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i] > aMaxDamage) {
                hp -= b[i];
                count++;
                if (hp <= 0) break;
            } else {
                break;
            }
        }
        
        while (hp > 0) {
            hp -= aMaxDamage;
            count++;
        }
        
        System.out.println(count);
    }
}
