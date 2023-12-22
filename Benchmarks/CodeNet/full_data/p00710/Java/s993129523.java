import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int r = scan.nextInt();
			if(n == 0 && r == 0){
				break;
			}
			int[] card = new int[n];
			for(int i = 0;i < n;i++){
				card[i] = n-i;
			}
			int p;
			int c;
			for(int i = 0;i < r;i++){
				p = scan.nextInt();
				c = scan.nextInt();
				card = shuffle(card,p,c);
			}
			System.out.println(card[0]);
		}
	}
	
	public static int[] shuffle(int[] a,int p,int c){
		int[] b = new int[a.length];
		int i = 0;
		for(int j = 0;j < c;j++){
			b[i++] = a[p-1+j];
		}			
		for(int j = 0;j < p-1;j++){
			b[i++] = a[j];
		}			
		for(int j = p+c-1;j < a.length;j++){
			b[i++] = a[j];
		}
		return b;
	}
}