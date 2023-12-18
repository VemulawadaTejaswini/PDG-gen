import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static String s;
	static String[] sw;
	static String first;
	static String last;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		s=sc.next();
		sw=new String[N];
		int count=0;
		//i=0が羊と仮定
		first="S";
		sw[0]="S";
		//i=N-1が羊のとき
		last="S";
		sw[N-1]="S";
		if(solve()){
			for(int i=0;i<N;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, null);
		//i=N-1が狼のとき
		sw[0]="S";
		last="W";
		sw[N-1]="W";
		if(solve()){
			for(int i=0;i<N;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, null);
		//i=0が狼と仮定
		first="W";
		sw[0]="W";
		//i=N-1が羊の時
		last="S";
		sw[N-1]="S";
		if(solve()){
			for(int i=0;i<N;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, null);
		//i=N-1が狼の時
		sw[0]="W";
		last="W";
		sw[N-1]="W";
		if(solve()){
			for(int i=0;i<N;i++)System.out.print(sw[i]);
			return;
		}
		System.out.println(-1);
	}
	static boolean solve(){
		for(int i=0;i<s.length()-1;i++){
			if((sw[i]=="S" && s.charAt(i)=='o')||(sw[i]=="W" && s.charAt(i)=='x')){
				sw[i+1]=sw[i];
			}else{
				if(sw[i]=="S")sw[i+1]="W";
				else sw[i+1]="S";
			}
		}
		if((sw[N-1]=="S" && s.charAt(N-1)=='o')||(sw[N-1]=="W" && s.charAt(N-1)=='x')){
			sw[0]=sw[N-1];
		}else{
			if(sw[N-1]=="S")sw[0]="W";
			else sw[0]="S";
		}
		if(sw[N-1]==last && sw[0]==first)return true;
		else return false;
	}

}
