import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        int x = (int)Math.pow(2, l - 1);
        List<Long> list = new ArrayList<Long>();
        
        for (int i = 0; i < x; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            while (binaryNumber.length() < l - 1) {
                binaryNumber = "0" + binaryNumber;
            }
            
            
            int start = 0;
            String tmpstr = "";
            for (int j = 1; j < l; j++) {
                boolean plusExists = binaryNumber.charAt(j - 1) == '1';
                if (plusExists) {
                    String strNum = str.substring(start, j);
                    list.add(Long.parseLong(strNum));
                    start = j;
                }
                
                if (j == l - 1) {
                    String strNum = str.substring(start, l);
                    list.add(Long.parseLong(strNum));
                    start = j;
                }
            }
        }
        
        long sum = 0;
        for (Long n : list) {
            sum += n;
        }
        System.out.println(sum);
    }
}
