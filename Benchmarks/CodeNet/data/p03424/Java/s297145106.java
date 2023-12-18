import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//, b = sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[a];
		//String s=sc.next();//,t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<a;i++) {
			buff=sc.next();
			if(buff.equals("P")) {
				array[0]++;
			}else if(buff.equals("G")) {
				array[1]++;
			}else if(buff.equals("Y")) {
				array[2]++;
			}else {
				array[3]++;
			}
		}
		for(int i=0;i<a;i++) {
			if(array[i]!=0)count++;
		}

		if(count==3)System.out.println("Three");
		if(count==4)System.out.println("Four");
	}
	public static int sample(int n) {
		return n;
	}

}
