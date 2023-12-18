import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] line2 = line.split(" ",0);
		int N = Integer.parseInt(line2[0]);
		int Q = Integer.parseInt(line2[1]);
		String S = scan.nextLine();
		String T = "";
		int l=1;
		int r=2;
		int counta=0;
		int total=0;
		int[] ans = new int[Q];
		String[] t = new String[N];
		for(int x=0;x<Q;x++){
			counta=0;
			total=0;
			l = scan.nextInt();
			r = scan.nextInt();
			T=S.substring(l-1,r);
			t = T.split("",0);
			for(int y=0;y<T.length();y++){
				if(t[y]==null){
					break;
				}
				if(t[y].equals("A")){
					counta++;
				}
				if(counta==1&&t[y].equals("C")){
					counta--;
					total++;
				}
			}
			ans[x]=total;
		}
		for(int z=0;z<Q;z++){
			System.out.println(ans[z]);
		}
	}
}