import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int N;
	static ArrayList<String> sr = new ArrayList<String>();
	static ArrayList<String> sg = new ArrayList<String>();
	static ArrayList<String> sb = new ArrayList<String>();
	static ArrayList<Integer> nr = new ArrayList<Integer>();
	static ArrayList<Integer> ng = new ArrayList<Integer>();
	static ArrayList<Integer> nb = new ArrayList<Integer>();
	public static int dfs(int i,int j,int k) {
		int a,b,c;
		a=nr.get(i).intValue();
		b=ng.get(j).intValue();
		c=nb.get(k).intValue();
		int[] num= {a,b,c};
		Arrays.sort(num);
		if(2*(num[1])!=num[0]+num[2]) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		String str[]=new String[N];
		String s=sc.next();
		for(int i=0;i<N;i++) {
			str[i]=String.valueOf(s.charAt(i));
			if(str[i].contentEquals("R")) {
				sr.add("R");
				nr.add(i);
			}
			else if(str[i].contentEquals("G")) {
				sg.add("G");
				ng.add(i);
			}
			else {
				sb.add("B");
				nb.add(i);
			}
		}
		int ans=0;
		for(int i=0;i<sr.size();i++) {
			for(int j=0;j<sg.size();j++) {
				for(int k=0;k<sb.size();k++) {
					ans+=dfs(i,j,k);
				}
			}
		}
		System.out.println(ans);
	}
}
