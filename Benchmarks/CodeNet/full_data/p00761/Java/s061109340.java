import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int L = sc.nextInt();
            if (n == 0 && L == 0) break;
            
            int newNum;
            int count = 0;
            
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            hm.put(n, 0);
            
            while (true) {
                count++;
                newNum = getNewNum(n, L);
                if (hm.containsKey(newNum)) {
                    break;
                }
                hm.put(newNum, count);
                n = newNum;
            }
            
            System.out.println(hm.get(newNum) + " " + newNum + " " + (count - hm.get(newNum)));
        }
    }
    
    public static String padZero(int n, int L) {
        String str = n + "";
        while (str.length() < L) {
            str += "0";
        }
        return str;
    }
    
    public static int getNewNum(int n, int L) {
        String str = padZero(n, L);
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        
        String small = new String(charArray);
        String big = new StringBuilder(small).reverse().toString();
        
        return Integer.parseInt(big, 10) - Integer.parseInt(small, 10);
    }
    
}


