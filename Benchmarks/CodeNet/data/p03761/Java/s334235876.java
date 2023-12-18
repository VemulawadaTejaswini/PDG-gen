import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
		Scanner  sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
	for(int i=0;i<51;i++) {
		for(int j=0;j<51;j++) {
			dp[i][j]=0;
		}
	}
	int n=sc.nextInt();
	char a[]=sc.next().toCharArray(),b[]=sc.next().toCharArray(),c[]=sc.next().toCharArray();
		int min=Math.min(a.length, b.length);
		int wanted=Math.min(min,c.length);
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);
	for(int i=0;i<51;i++) {
		for(int j=0;j<51;j++) {
			dp[i][j]=0;
		}
	}
		boolean flag=false;
		boolean flag1=false;
		if(wanted==a.length) {
			if(lcs(a,b)==false) {
				flag=true;
			}
			if(lcs(a,c)==false) {
				flag1=true;
			}
			
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	int i=a.length;
	int j=b.length;
	LinkedList<Character> aa=new LinkedList<>();
	while(i>0&&j>0){
		if(a[i-1]==b[j-1]) {
		aa.addFirst(a[i-1]);
		i--;
		j--;
		}else {
			if(dp[i][j-1]>dp[i-1][j])
			j--;
		else {
			i--;
		}
	}
	}
	for(char k:aa) {
		System.out.print(k);
	}
	
	System.out.println();
}
		}else if(wanted==b.length) {
			if(lcs(b,a)==false) {
				flag=true;
			}
			if(lcs(b,c)==false) {
				flag1=true;
			}
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	int i=a.length;
	int j=b.length;
	LinkedList<Character> aa=new LinkedList<>();
	while(i>0&&j>0){
		if(a[i-1]==b[j-1]) {
		aa.addFirst(a[i-1]);
		i--;
		j--;
		}else {
			if(dp[i][j-1]>dp[i-1][j])
			j--;
		else {
			i--;
		}
	}
	}
	for(char k:aa) {
		System.out.print(k);
	}
	
	System.out.println();

}
		}else {
			if(lcs(c,a)==false) {
				flag=true;
			}
			if(lcs(c,b)==false) {
				flag1=true;
			}
			if(flag1==true||flag==true) {
				System.out.println();
}else {
	int i=a.length;
	int j=c.length;
	LinkedList<Character> aa=new LinkedList<>();
	while(i>0&&j>0){
		if(a[i-1]==c[j-1]) {
		aa.addFirst(c[j-1]);
		i--;
		j--;
		}else {
			if(dp[i][j-1]>dp[i-1][j])
			j--;
		else {
			i--;
		}
	}
	}
	for(char k:aa) {
		System.out.print(k);
	}
	
	System.out.println();
}
		}
	
		out.flush();

	
	}
	
	static int dp[][]=new int[51][51];
	static boolean lcs(char a[],char b[]) {
		
		for(int i=0;i<=50;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<=50;i++) {
			dp[0][i]=0;
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=b.length;j++) {
				if(a[i-1]==b[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[a.length][b.length]!=0;
	}
	}