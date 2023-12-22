import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int min = a;
		
		if(b<a){
			min = b;
		}else if(c<b){
			min = c;
		}
		
		int max = a;
		
		if(a<b){
			max = b;
		}else if(b<c){
			max = c;
		}
		
		int mid = a;
		
		if(min<b && max>b){
			mid = b;
		}else if(min<c && min>c){
			mid = c;
		}

		System.out.println(min + " " + mid + " " + max );
	}
}