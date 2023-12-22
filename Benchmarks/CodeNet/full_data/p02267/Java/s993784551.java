import java.util.Scanner;
public class Main{
	public static int search(int[] a,int key,int n){
		int i = 0;
		a[n]=key;
		while(a[i]!=key){
			i++;
		}
		if(i==n){
			return 0;
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result=0;
		int n = scan.nextInt();
		int[] S = new int[n+1];
		for(int i = 0 ; i < n ; i ++){
			S[i]=scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for(int i = 0 ; i < q ; i ++){
			T[i]=scan.nextInt();
		}
		for(int i = 0; i < q ; i ++){
			result = search(S,T[i],n);
			if(result !=0){
				System.out.println(result+1);
				System.exit(0);
			}
		}
		System.out.println("0");
		scan.close();
	}

}