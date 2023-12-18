import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String Sn[] = new String[N];
		for(int sGet = 0;sGet < N;sGet++){
			Sn[sGet] = sc.next();
			char[] chars = Sn[sGet].toCharArray();
			//並べ替えを行う
			Arrays.sort(chars);
			String newSget = new String(chars); 
			Sn[sGet] = newSget;
			//System.out.println(Sn[sGet]);
		}
		Arrays.sort(Sn);
		for(int num = 0;num < Sn.length;num++){
			System.out.print(Sn[num]);
		}
		System.out.println();


	}
}
