import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] A = new int[N];
			int kieta=1;//文字が消えているかどうかの状態最初の一文字目はカウントしてある
			int count =1;
			
			
			for(int i=0;i<N;i++) {//拡張for文は指示できるものと：格納したもの達
				A[i] = scan.nextInt();
			}
			
			Arrays.sort(A);
			
			
						
			for(int i = 0;i<N-1;i++) {
				if(A[i]!=A[i+1]) {//別の文字になるからkietaもリセットする
					kieta=1;
					count+=1;
				}
				
				if(A[i]==A[i+1]&&kieta==0) {//隣り合う数字が一緒で文字が書かれてない時はcount
					kieta=1;//文字が書かれている状態
					count=count+1;
				}
				
				if(A[i]==A[i+1]&&kieta==1) {//隣り合う文字が一緒だが文字が既に書かれているなら一つ減らす
					kieta=0;
					count=count-1;
				}
				
				
				
			}
			
			
			System.out.println(count);
						
		}
		
	}

}
