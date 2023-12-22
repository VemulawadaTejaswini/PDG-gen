public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		for(int i = 0;i < H;i++){
			for(int j = 1;j < W;j++)
				System.out.print('#');
			System.out.println('#');
		}
	}

}