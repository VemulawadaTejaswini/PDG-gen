import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, n = sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		//String[] array = new String[N];
		String s=sc.next();//,t=sc.next();
		String buff1,buff2;

		for(int i=0;i<s.length()-1;i++) {
			buff1=s.substring(i,i+1);
			buff2=s.substring(i+1,i+2);
			for(int j=0;j<buff1.length();j++) {
				for(int k=0;k<buff2.length();k++) {
					if(buff1.charAt(j)==buff2.charAt(k))count++;
				}
			}
			max=Math.max(count, max);
			count=0;
		}

		System.out.println(max);

	}
	public static int sample(int n) {
		return n;
	}

}
