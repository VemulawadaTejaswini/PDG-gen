import java.util.Scanner;
public class Main {
static long ans=0;
static boolean check=false;
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int X=sc.nextInt();
	int Y=sc.nextInt();
	int habu=0;
	habu=Math.min(X/3, Y/3);
	X-=3*habu;
	Y-=3*habu;
	if(!(X==0&&Y==0)) {
	plus(0,0,1,2,X,Y);
	plus(0,0,2,1,X,Y);
	}else {
		ans=(long) (Math.pow(2, habu));
	}
	if(check) {
		ans*=(long) Math.pow(2, habu);
	}
	ans=(long) ((ans)%(Math.pow(10, 9)+7));
	System.out.println(ans);
}
public static void plus(int x,int y,int x1,int y1,int X,int Y) {
	x+=x1;
	y+=y1;
	if(x==X&&y==Y) {
		check=true;
		ans++;
		return;
	}
	if(x>X||y>Y) {
		return;
	}
	//System.out.println(x+" "+y);
	plus(x,y,1,2,X,Y);
	plus(x,y,2,1,X,Y);

}
}