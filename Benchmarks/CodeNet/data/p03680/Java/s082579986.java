import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		
		int N = scan.nextInt();
		int[] a = new int[N];
		
		
		
		for(int i = 0;i<N;i++){
			a[i]=scan.nextInt();
		}
		
		
		int start = 1;
		int fin =0;
		int count =0;
		int dashi =0;
		
		
		while(true){
			if(a[start-1]==2){
				dashi = 1;
				break;
			}
			
			start = a[start-1];
			count+=1;
			
			
			if(count ==100000){
				break;
			}
		}
		
		System.out.println(dashi==1?count:-1);
		
		
		
		
		
		
		
	}

}
