import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int[]a={0,0,0,0};
		for(int i=0;i<6;++i)
			++a[s.nextInt()-1];
		System.err.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.equals(a,new int[]{1,1,2,2})?"YES":"NO");
	}
}
