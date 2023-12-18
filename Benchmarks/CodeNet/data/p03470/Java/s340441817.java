import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),d,t[]=new int[100],s=0,i;
		for(i=0;i<n;i++) {
			d=stdIn.nextInt();
			t[d-1]++;
		}
		for(i=0;i<100;i++) if(t[i]>0) s++;
		System.out.print(s);
	}
}