import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();

		for(int i=0;i<count;i++){
			int[] array=new int[3];
			for(int k=0;k<3;k++){
				array[k]=scanner.nextInt();
			}

			if(isRightTriangle(array))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	static boolean isRightTriangle(int a,int b,int c) {
		return c==Math.sqrt(a*a+b*b);
	}

	static boolean isRightTriangle(int[] array) {
		if(isRightTriangle(array[0], array[1], array[2]))
			return true;
		if(isRightTriangle(array[1], array[2], array[0]))
			return true;
		if(isRightTriangle(array[2], array[0], array[1]))
			return true;
		return false;
	}
}