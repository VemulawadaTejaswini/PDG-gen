import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			if(N==0)break;
			int a[] = new int[N];
			for(int i=0;i<N;i++){
				a[i]=sc.nextInt();
			}
			boolean t =false;
			for(int i = 0; i < a.length; i++) {
				if(i==0){
					System.out.print(a[i]);
				}else{
					if(a[i-1]+1==a[i]){
						t=true;
						continue;
					}else{
						if(t)System.out.print("-"+a[i-1]);
						System.out.print(" "+a[i]);
						t=false;
						continue;
					}
				}
			}
			if(t){
				System.out.print("-"+a[a.length-1]);
			}
			System.out.println();
		}
	}
}