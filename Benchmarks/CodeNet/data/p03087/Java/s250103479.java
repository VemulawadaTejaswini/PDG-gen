import java.util.*;

public class Main {

    public static boolean isBetween(int ac, int l, int r) {
        if (ac >= l && ac+1 <= r) {
            return true;
        }
        return false;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nS = sc.next();
        int n = Integer.parseInt(nS);
        String qS = sc.next();
        int q = Integer.parseInt(qS);
        String enter = sc.nextLine();
      	String s = sc.nextLine();

        int[] acList = new int[n];
        int indexOfList = 0;
        boolean isA = false;
        for (int i =0; i<s.length(); i++) {
            if (s.charAt(i) == 'A') {
                isA = true;
            }
            else if (isA && s.charAt(i) == 'C') {
                acList[indexOfList] = i - 1;
                indexOfList++;
                isA = false;  
            }
            else {
                isA = false;
            }
        }
                               
        for (int i =0; i<q; i++) {
            int result = 0;
            String nl = sc.next();
        	int l = Integer.parseInt(nl);
            l--;
                  String rS = sc.next();
        int r = Integer.parseInt(rS);
            r--;
          if (i != q-1) {
          String enter2 = sc.nextLine();}
            for (int j =0; j<indexOfList; j++) {
                if (isBetween(acList[j], l, r)) {
                    result++;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }


}