import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ0169();
	}
	
	void AOJ0169(){
		while(sc.hasNext()){
			String[] s=sc.nextLine().split(" ");
			if(s[0].equals("0"))	break;
			int ans=0,c=0;
			for(String i:s){
				c+=(i.equals("1")?1:0);
				ans+=solve0169(i);
			}
			while(--c>=0){
				if(ans+10>21)	break;
				ans+=10;
			}
			out.println((ans<=21?ans:0));
		}
	}
	int solve0169(String s){
		int r=Integer.parseInt(s);
		if(r>=10)	return 10;
		return r;
	}
}