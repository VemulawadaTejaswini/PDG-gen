import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long[][] array = new long[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextLong();
            array[i][1] = sc.nextLong();
            array[i][2] = sc.nextLong();
        }
        
        
        long best = 0;
        int combinationCount = (int)Math.pow(2, 3);
        for (int i = 0; i < combinationCount; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            while (binaryNumber.length() < 3) {
                binaryNumber = "0" + binaryNumber;
            }
            
            long[][] array2 = new long[n][2];
            for (int s = 0; s < n; s++) {
                array2[s][1] = s;
            }
            
            for (int j = 0; j < 3; j++) {
                String str = String.valueOf(binaryNumber.charAt(j));
                
                for (int s = 0; s < n; s++) {
                    if (str.equals("0")) {
                        array2[s][0] += array[s][j];
                    } else {
                        array2[s][0] -= array[s][j];
                    }
                }
            }
            
            Arrays.sort(array2, (a, b) -> Long.compare(a[0], b[0]));
            
            long tmp = 0;
            
            for (int s = n - 1; s > n - 1 - k; s--) {
                tmp += array2[s][0];
            }
            
            best = Math.max(best, tmp);
        }
        System.out.println(best);
    }
}
