import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int x1 = sc.nextInt();
int y1 = sc.nextInt();
int x2 = sc.nextInt();
int y2 = sc.nextInt();

int x3,y3,x4,y4,lx,ly;
lx=x2-x1;
ly=y2-y1;

y3=y2+lx;
x3=x2-ly;

y4=y3-ly;
x4=x3-lx;


System.out.println(x3+" "+y3+" "+x4+" "+y4);


sc.close();

	}


}
