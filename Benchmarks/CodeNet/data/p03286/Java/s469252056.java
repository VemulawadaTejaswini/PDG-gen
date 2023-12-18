import java.util.Scanner;
 
class Main{
	public static void main(String[] aegs) {
		Scanner sc=new Scanner(System.in);
 
		long tmp=11453246122L;
		long ans=sc.nextLong();
 
		long res=tmp|(tmp+ans);
		String bin = Integer.toBinaryString((int)res);
		System.out.println(bin);
	}
}