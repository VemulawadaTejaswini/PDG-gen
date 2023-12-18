import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[] a = new int[n];
		boolean flg = true;
		for(int i=0; i<n; i++){
			//a[i] = sc.nextInt();
			int a = sc.nextInt();
			if(a%2 == 0){
				if(!(a%3==0 || a%5==0)){
					flg = false;
					
				}
			}
		}
		System.out.println(flg ? "APPROVED" : "DENIED");
	}
}
