import java.util.*;
import java.io.*;

class Main{
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	public Main(){
		int d=a/b;
		int r=a%b;
                double f=(double)a/(double)b;
		System.out.printf("%d %d %.5f", d, r, f);
	}
	public static void main(String[] args){
		new Main();
	}
}