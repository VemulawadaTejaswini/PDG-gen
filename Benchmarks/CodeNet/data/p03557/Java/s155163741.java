import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A  = new int[N];
			int[]B  = new int[N];
			int[]C  = new int[N];
			int[]a  = new int[N];
			int[]b  = new int[N];
			int[]c  = new int[N];
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				a[i] = A[i];
			}
			for(int i = 0;i<N;i++) {
				B[i] = scan.nextInt();
				b[i] = B[i];
			}
			for(int i = 0;i<N;i++) {
				C[i] = scan.nextInt();
				c[i] = C[i];
			
			}
			
			Arrays.sort(B);
			Arrays.sort(C);
			
			for(int i = 0;i<N;i++) {
				//System.out.print(A[i]+" ");
			}
			//System.out.println();
			for(int i = 0;i<N;i++) {
				//System.out.print(B[i]+" ");
			}
			//System.out.println();
			for(int i = 0;i<N;i++) {
				//System.out.print(C[i]+" ");
			}
			//System.out.println();
			
			
			
			long goukei = 0;
			
			
			for(int i = 0;i<N;i++) {
				int target = A[i];
				int L =0;
				int R =N-1;
				int ijyou = 0;
				int ika = N-1;
				int mid = 0;
				int cstart = 0;
				
				if(target<B[0]) {//A[i]でできるBの種類は全て
					cstart = 0;	
				}else if(target>=B[N-1]) {//A[i]でできる種類はない
					continue;
				}else {
					while(L<R) {
						 mid = (L+R)/2;
						 if(B[mid]==target) {
							 cstart = mid+1;
							 break;
						 }else if(B[mid]>target) {
							R =mid;
							ika =mid;
						}else if(B[mid]<target) {
							L = mid+1;
							ijyou =mid;
						}
					}
					//System.out.println(mid);
					//System.out.println("A["+i+"]はB["+ijyou+"]より大きく　B["+ika+"]より小さい　");
					cstart = ika;	
				}
				
				//System.out.println("A["+i+"]は B["+cstart+"]からスタート　");
				
				for(int k =cstart;k<N;k++) {
					int tar = B[k];
					int l =0;
					int r =N-1;
					int ij = 0;
					int ik = N-1;
					int mi = 0;
					int ok=0;
					if(tar<C[0]) {//B[i]でできる種類は全て
						goukei+=C.length;
						//System.out.println();
					}else if(tar>=C[N-1]) {//B[i]でできる種類はない
						continue;
					}else {
						while(l<r) {
							 mi = (l+r)/2;
							 if(C[mi]==tar) {
								 goukei+=(N-1-(mi+1)+1);
								 //System.out.println(C[mi]);
								 ok=1;
								 break;
							 }else if(C[mi]>tar) {
								r =mi;
								ik =mi;
							}else if(C[mi]<tar) {
								l = mi+1;
								ij=mi;
							}
						}
				
					//System.out.println(mi);
						if(ok==0) {
					//System.out.print("B["+k+"]は"+ij+"以上　"+ik+"以下　");
					//System.out.println(N-1-ik+1);
					goukei+=(N-1-ik+1);
						}else{
							//System.out.print("B["+k+"]はC"+mi+"等しい　");
							//System.out.println(N-1-mi);
						}
						
						
					}
				}
				
			}
				
				
				
				
			
				System.out.println(goukei);
			
			
			
			
			
			
			
			
	
			
			
		}
	}
}
