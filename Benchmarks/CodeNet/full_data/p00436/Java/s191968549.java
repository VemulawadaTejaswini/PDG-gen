import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			String[] card = new String[2*n];
			for(int i = 1;i <= 2*n;i++){
				card[i-1] = String.valueOf(i);
			}
			int k;
			for(int i = 0;i < m;i++){
				k = scan.nextInt();
				if(k == 0){
					card = rShuffle(card,n);
				}else{
					card = shuffle(card,k,n);
				}
			}
			for(int j = 0;j < 2*n;j++){
				System.out.println(card[j]);
			}
		//}
	}
	
	public static String[] rShuffle(String[] a,int n){
		String[] b = new String[a.length];
		for(int i = 0,j = 0;i < a.length;i+=2,j++){
			b[i] = a[j];
		}
		for(int i = 1,j = n;i < a.length;i+=2,j++){
			b[i] = a[j];
		}
		return b;
	}
	
	public static String[] shuffle(String[] a,int k,int n){
		String[] b = new String[a.length];
		for(int i = 0,j = k;j < 2*n;i++,j++){
			b[i] = a[j];
		}
		for(int i = 2*n-k,j = 0;j < k;i++,j++){
			b[i] = a[j];
		}
		return b;
	}
}