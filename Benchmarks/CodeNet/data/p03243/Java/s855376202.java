import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		char t[]=N.toCharArray();
		int n=Integer.parseInt(N);
		int comp=0;
		int ans=0;
		int T[]=new int[t.length];
		for(int i=0;i<t.length;i++){
			T[i]=Character.getNumericValue(t[i]);
		}
		comp=T[0]*111;
		if(n<=comp){
			ans=comp;
		}else if(n>comp){
			ans=comp+111;
		}
		System.out.print(ans);
	}

}