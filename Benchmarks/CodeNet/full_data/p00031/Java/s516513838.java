import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] scalepans = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        boolean[] isUsed = new boolean [10];
        
        while (scanner.hasNext()) {
            int leftWeight = scanner.nextInt();
            int rightWeight = 0;
            int cnt = 0;
            
            while (leftWeight == rightWeight) {
                for (int i = scalepans.length-1; i >= 0; i--) {
                    if ((leftWeight - rightWeight) >= scalepans[i]) {
                        isUsed[i] = true;
                        cnt++;
                    }
                }
            }
            for (int i = 0; i < isUsed.length; i++) {
                if (isUsed[i]) {
                    if (cnt != 0) {
                        System.out.print(scalepans[i] + " ");
                    } else {
                        System.out.println(scalepans[i]);
                    }
                }
                cnt--;
            }
        }
    }
}