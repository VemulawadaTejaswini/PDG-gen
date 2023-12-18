import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int s = S.length();
        long n = 0;
        int ans = 0;
        
        for(int i=1;i<s;i++) {
        	n=0;
          	for(int j=i+1;j<=s;j++) {
        		n = Long.parseLong(S.substring(i-1, j));
        		if(n % 2019 == 0) {
        			System.out.println("i="+i);
        			System.out.println("j="+j);
        			ans++;
        		}
        	}        	
        }
        
        System.out.print(ans);
        
	}
}