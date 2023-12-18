import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);

		int
		i=s.nextInt(),
		o=s.nextInt(),
		t=s.nextInt(),
		j=s.nextInt(),
		l=s.nextInt(),
		S=s.nextInt(),
		z=s.nextInt();

		int r=0;
		int v=Math.min(l,j);
		i-=v;
		r+=v;

		System.out.println(r+i/2*2+o);
	}
}