import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),t=s.nextInt()-1;
		char[] c=s.next().toCharArray();
		c[t]+='a'-'A';
		System.out.println(c);
	}
}