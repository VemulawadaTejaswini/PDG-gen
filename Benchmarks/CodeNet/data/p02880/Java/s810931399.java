import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b[]=new int[36];
		for(int i=0;i<10;i++) {
			b[i]=i+1;
		}
		b[10]=12;
		b[11]=14;
		b[12]=15;
		b[13]=16;
		b[14]=18;
		b[15]=20;
		b[16]=21;
		b[17]=24;
		b[18]=25;
		b[19]=27;
		b[20]=28;
		b[21]=30;
		b[22]=32;
		b[23]=35;
		b[24]=36;
		b[25]=40;
		b[26]=42;
		b[27]=45;
		b[28]=48;
		b[29]=49;
		b[30]=56;
		b[31]=63;
		b[32]=64;
		b[33]=72;
		b[34]=81;
		b[35]=54;
		while(sc.hasNextInt()) {
			a=sc.nextInt();
			for(int i=0;i<36;i++) {
				if(a==b[i]) {
					System.out.println("Yes");
					break;
				}
				if(i==35&&a!=b[35]) {
					System.out.println("No");
				}
			}
			
		}
	}

}