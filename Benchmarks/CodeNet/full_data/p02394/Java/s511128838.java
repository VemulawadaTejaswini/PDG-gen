import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int W;
int H;
int x;
int y;
int r;


W=sc.nextInt();
H=sc.nextInt();
x=sc.nextInt();
y=sc.nextInt();
r=sc.nextInt();

if((x-r)>=0 && (x+r)<=W){
	System.out.println("Yes");
}else {
	System.out.println("No");
}

	}
	}