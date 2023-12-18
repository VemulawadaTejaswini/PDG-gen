import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer>ts=new TreeSet<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) ts.add(sc.nextInt());
		if(ts.size()==n)System.out.println("YES");
		else System.out.println("NO");
	}
}