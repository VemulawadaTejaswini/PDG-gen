import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int ans = 0;
        if (num > 0) {
            String str = sc.next();
            String value1 = "#";
            String value2 = ".";
            int value1Count = 0;
            int value2Count = 0;
            boolean whiteFlag = false;
            int whiteCount = 0;
            boolean blackFlag = false;
            int blackCount = 0;
            boolean switchFlag = false;
            int switchCount = 0;
            
            String tmpValue = "";
            for (int i = 0; i < num; i++) {
                tmpValue = String.valueOf(str.charAt(i));
                if (tmpValue.equals(value1)) {
                    whiteFlag = true;
                    switchFlag = false;
                    if (!blackFlag) {
                        value1Count++;
                        blackFlag = true;
                    } else {
                        switchCount++;
                    }
                } else if (tmpValue.equals(value2)) {
                    if (whiteFlag) {
                        switchFlag = true;
                        value1Count += switchCount;
                        value2Count++;
                        switchCount = 0;
                    } else {
                        whiteCount++;
                    }
                } else {
                    
                }
            }
            
            if (value1Count >= value2Count) {
                ans = value2Count;
            } else if (value1Count <= value2Count) {
                ans = value1Count;
            } else {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
