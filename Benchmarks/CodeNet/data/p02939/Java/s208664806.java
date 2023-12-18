import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[] t=s.next().toCharArray();
		int r=1;
		for(int i=1;i<t.length;++i){
			if(t[i-1]!=t[i]) {
				++r;
			}else if(i<t.length-1){
				r+=2;
				i+=2;
			}

		}
		System.out.println(r);
	}
}
