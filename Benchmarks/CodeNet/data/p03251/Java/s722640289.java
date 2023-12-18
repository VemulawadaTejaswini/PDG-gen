import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[]$){
		int n=s.nextInt(),m=s.nextInt();
		int x=s.nextInt(),y=s.nextInt();
		int[]a=new int[n];
		int[]b=new int[m];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		int max=Arrays.stream(a).max().getAsInt();
		int min=Arrays.stream(b).min().getAsInt();
		
		int c=Math.max(x,max);
		int d=Math.min(y,min);
		
		System.out.println(c<d?"No War":"War");
	}
}