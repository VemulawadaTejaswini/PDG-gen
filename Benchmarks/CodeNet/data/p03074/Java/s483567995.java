import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        
        int[] sArray = new int[n + 1];
        int j = 0;
        int nowNum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(String.valueOf(s.charAt(i)));
            if (num == nowNum) {
                count++;
                continue;
            } else {
                sArray[j] = count;
                j++;
                count = 1;
                if (nowNum == 0) {
                    nowNum = 1;
                } else {
                    nowNum = 0;
                }
            }
        }
        sArray[j] = count;
        j++;
        
        int max = sArray[0];
        for (int i = 0; i < n; i++) {
            boolean end = false;
            int cnt = sArray[i];
            if (i % 2 == 0) {
                for (int l = i + 1; l < i + k * 2; l++) {
                    cnt += sArray[l];
                    if (cnt == 0) end = true;
                }
            } else {
                for (int l = i + 1; l <= i + k * 2; l++) {
                    cnt += sArray[l];
                    if (cnt == 0) end = true;
                }
            }
            
            if (end) break;
            max = Math.max(max, cnt);
        }
        
        System.out.println(max);
    }
}