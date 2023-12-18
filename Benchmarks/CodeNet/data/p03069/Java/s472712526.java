import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	sc.close();
	int ans =Integer.MAX_VALUE;
	for(int i =0; i<n; i++) {
	 int c=0; 
	 for(int j=0;j<n;j++) {
	 if(s.charAt(j)=='#'&&j<=i) {c++;}
	 if(s.charAt(j)=='.'&&j>i) {c++;}
	 }
	ans = Math.min(c,ans);
	}
	
  System.out.println(ans);
    }

}
