import java.util.Scanner;
 class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int[] a = {0,0,0,0,0,0,0};
		int[] b = {0,0,0,0,0,0,0};
		
		for(int i=0;i<=7;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			System.out.println(a[i]-b[i]);
		}
		}
	
}