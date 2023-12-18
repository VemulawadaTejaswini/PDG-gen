import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] line2 = line.split(" ",0);
		int N = Integer.parseInt(line2[0]);
		int Q = Integer.parseInt(line2[1]);
		String S = scan.nextLine();
		String[] s = S.split("",0);
		int l=1;
		int r=2;
		int counta=0;
		int total=0;
		int[] ans = new int[Q];
		for(int x=0;x<Q;x++){
			l = scan.nextInt();
			r = scan.nextInt();
			total=0;
			counta=0;
			for(int y=l-1;y<=r-1;y++){
				if(s[y].equals("A")){
					counta++;
				}
				if(counta==1&&s[y].equals("C")){
					counta--;
					total++;
				}
				ans[x]=total;
			}
		}
		for(int z=0;z<Q;z++){
			System.out.println(ans[z]);
		}
	}
}