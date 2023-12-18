import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int x = Integer.parseInt(as.next());
		int y = Integer.parseInt(as.next());
		int n;
		if(x<y&&x>=0){
			n = y-x;
		}else if(y<x&&y>=0){
			n = y+x+1;
		}else if(x>y&&x>=0&&y<0&&Math.abs(y)>x){
			n = Math.abs(y)-x+1;
		}else if(x>y&&x>=0&&y<0&&Math.abs(y)<x){
			n = x-Math.abs(y)+1;
		}else if(x<y&&x<0&&y>=0&&Math.abs(x)>y){
			n = y-x;
		}else if(x<y&&x<0&&y>=0&&Math.abs(x)<y){
			n = y-Math.abs(x)+1;
		}else if(x>y&&x<0){
			n = Math.abs(y)-Math.abs(x)+2;
		}else if(y>x&&y<0){
			n = y-x;
		}else if(x==y){
			n = 0;
		}else{
			n = 1;
		}
		System.out.println(n);
	}
}