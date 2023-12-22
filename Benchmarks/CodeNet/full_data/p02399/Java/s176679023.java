import java.util.*;

class Main{
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
        float f;
	public Main(){
		int d=a/b;
		int r=a%b;
		f=(float)a/b;
		System.out.printf(d+" "+r+" "+("%.5f\n",f));
	}
	public static void main(String[] args){
		new Main();
	}
}