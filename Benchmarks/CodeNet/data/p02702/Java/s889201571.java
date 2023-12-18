import java.util.*;

class Main {
    static boolean isMultiple (String s, int base, int m) {
	    int temp = 0;
	    for (int i=0; i<s.length(); i++) {
		    temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	    }
	    if (temp==0) {return true;}
	    return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i=0; i<=S.length()-4; i++) {
            for (int j=i+4; j<=S.length(); j++) {
                String str = S.substring(i, j);
                if(isMultiple(str,10,2019)) ans++;
            }
        }
        System.out.println(ans);
    }
}