import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			int r = scan.nextInt();
			int[] card = new int[n];
			for(int i = 0;i < n;i++){
				card[i] = i+1;
			}
			for(int i = 0;i < m;i++){
				card = shuffle(card,scan.nextInt(),scan.nextInt(),n);
			}
			int count = 0;
			for(int i = p-1;i < q;i++){
				if(card[i] <= r){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	public static int[] shuffle(int[] a,int x,int y,int n){
		int[] ans = new int[n];
		for(int i = 0;i < n-y;i++){
			ans[i] = a[i+y];
		}
		for(int i = 0;i < y-x;i++){
			ans[n-y+i] = a[i+x];
		}
		for(int i = 0;i < x;i++){
			ans[n-x+i] = a[i];
		}
		return ans;
	}
}