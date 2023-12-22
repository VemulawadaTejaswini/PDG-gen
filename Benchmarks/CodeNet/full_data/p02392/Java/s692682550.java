public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = Math.max(a, b);
		int max2 = Math.max(b, c);
		if(max < max2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}