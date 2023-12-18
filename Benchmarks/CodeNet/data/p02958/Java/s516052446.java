import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ary[]=new int[N+1];
		String ans="YES";
		int inc = 0;
		for(int i=1;i<=N;i++){
			ary[i]=sc.nextInt();
		}
		for(int i=1;i<=N;i++){
			if (i!=ary[i]) {
				inc = inc+1;
			}
		}
		if (inc==0||inc==2) {
			System.out.println(ans);
		}
		else{
		ans="NO";
		System.out.println(ans);}
    }
}
