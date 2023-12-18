import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner stdln = new Scanner(System.in);
		
		int flag = 0;
		int[] a = new int [1];
		
		for(int i = 0;i < a.length;i++){
			a[i] = stdln.nextInt();
		}
		
		for(int i = 0;i < a.length;i++){
			if(a[i] == 9) flag = 1;
		}
		
		if(flag == 0) System.out.println("No");		
		if(flag == 1) System.out.println("Yes");
	}
}