import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int s = S.length();
        int ans = 0;
        
        for(int i=1;i<s;i++) {
          	for(int j=i+1;j<=s;j++) {
         		if(isMultiple(S.substring(i-1,j), 10, 2019)) {
        			ans++;
        		}
        	}        	
        }
        
        System.out.print(ans);
        
	}
	static boolean isMultiple (String s, int base, int m) {
		int temp = 0;
		for (int i=0; i<s.length(); i++) {
			temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
		}
		if (temp==0) {return true;}
		return false;
	}
}

