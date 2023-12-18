import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("    "+Integer.toBinaryString(123));
//		System.out.println(Integer.toBinaryString(456));
//		System.out.println(Integer.toBinaryString(456-123));
//		System.out.println(Integer.toBinaryString(123^456));
//		System.out.println(123^456);
//		for(int j = 0; j < 30; j++) {
//			System.out.println(j+"  "+ (j+30));
//			//System.out.println(Integer.toBinaryString(j));
//			int k = j;
//			for(int i = k+1; i< j+30; i++) {
//				k = k^i;
//				//System.out.println(i+"  " + k);
//				//System.out.println(Integer.toBinaryString(i)+"  " +Integer.toBinaryString(k));
//			}
//			System.out.println(k+"  "+Integer.toBinaryString(j)+"  "+Integer.toBinaryString(k)+"  "+Integer.toBinaryString(j^(j+30)));
//			System.out.println("------------");
//		}
		Scanner sc = new Scanner(System.in);
		long A,B;
		A = sc.nextLong();
		B = sc.nextLong();
		//2,4,8,16,32,64,128,256,512,1024,2048,4096,...
		long C = B - A - 1;
		long ans = 0;
		if(C%2==0) {
			ans = 0;
		} else {
			ans = 1;
		}
		System.out.println(A^ans^B);
	}
}
