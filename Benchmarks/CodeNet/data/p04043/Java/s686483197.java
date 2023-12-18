import java.util.Arrays;
public class Main{
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		int[]number=new int[3];
		for(int i=0;i<number.length;i++) {
			number[i]=new java.util.Scanner(System.in).nextInt();
		}
		Arrays.sort(number);
		if(number[0]==5&&number[1]==5&&number[2]==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}