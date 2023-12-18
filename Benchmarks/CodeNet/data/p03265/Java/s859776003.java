import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		int dx=x2-x1;
		int dy=y2-y1;
		System.out.println((x2-dy)+" "+(y2+dx)+" "+(x1-dy)+" "+(y1+dx));
	}
}
