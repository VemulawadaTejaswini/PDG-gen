import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] s=a.split("");
		int r=0;
		int b=0;
		for(int i=0;i<s.length;i++){
			if(s[i].equals("0"))r++;
			if(s[i].equals("1"))b++;
		}
		System.out.print(chmin(r,b)*2);
	}
	private static int chmax(int a,int b){
		if(a>b) return a;
		else return b;
	}
	private static int chmin(int a,int b){
		if(a<b) return a;
		else return b;
	}
}