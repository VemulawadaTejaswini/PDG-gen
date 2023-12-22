
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		TCase:while(true){
			int a=sc.nextInt(),l=sc.nextInt();
			if(a==0)return;
			List<Integer> alist=new ArrayList<Integer>();
			alist.add(a);
			int c=0;
			while(true){
				c++;
				char[] str=String.format("%0"+l+"d",a).toCharArray();
				Arrays.sort(str);
				int min=0,max=0;
				for(int i=0;i<l;i++){
					min=10*min+ (str[i]-'0');
					max=10*max+(str[l-1-i]-'0');
				}
				a=max-min;
				if(alist.contains(a)){
					int ind=alist.indexOf(a);
					ln(ind+" "+a+" "+(c-ind));
					continue TCase;
				}
				alist.add(a);
			}


		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}