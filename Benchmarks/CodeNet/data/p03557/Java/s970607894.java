import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A  = new int[N];
			int[]B  = new int[N];
			int[]C  = new int[N];
			
			for(int i = 0;i<N;i++) A[i] = scan.nextInt();
			for(int i = 0;i<N;i++) B[i] = scan.nextInt();
			for(int i = 0;i<N;i++) C[i] = scan.nextInt();
			
			Arrays.sort(B);
			Arrays.sort(C);
			
			int[] b = new int[N];

			for(int i = 0;i<N;i++) {
				int target = B[i];
				int L =0;
				int R =N-1;
				int ijyou = 0;
				int ika = N-1;
				int mid = 0;
				int cstart = 0;
				int ok = 0;
				
				if(target<C[0]) {//B[i]でできるBの種類は全て
					cstart = 0;	
					//System.out.println("B["+i+"]はC["+0+"]より小さい");
					b[i] = N;
				}else if(target>=C[N-1]) {//B[i]でできる種類はない
					//System.out.println("B["+i+"]がCの全てより大きい");
					b[i] = 0;
					continue;
				}else {
					while(L<R) {
						 mid = (L+R)/2;
						 if(C[mid]==target) {						
							 cstart = mid+1;
							 ok=1;
							 break;
						 }else if(C[mid]>target) {
							R =mid;
							ika =mid;
						}else if(C[mid]<target) {
							L = mid+1;
							ijyou =mid;
						}
					}
				
					if(ok==0) {
						//System.out.println("B["+i+"]はC["+ijyou+"]より大きく　C["+ika+"]より小さい　");
						b[i] = N-1-ika+1;
					}else {
						//System.out.println("B["+i+"]はC"+mid+"等しい　");
						b[i] = N-1-(mid+1)+1;
					}
					cstart = ika;	
				}
				
			}
			
			
			/*for(int i = 0;i<N;i++) {
				System.out.print(b[i]+" ");
			}
			
			System.out.println();
			*/
			
			int[] a = new int[N+1];//iが増えてくごとにb[i]後ろから足していく
			int wa  = 0;
			for(int i = 0;i<=N;i++) {
				if(i==0) {a[0]= 0;}
				else {
				wa+=b[N-i];	
				a[i] = wa;
				}
			}
			
			/*
			
			for(int i = 0;i<=N;i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			
			*/
			
			int[] AZ = new int[N];
			
			
			
			for(int i = 0;i<N;i++) {
				int target = A[i];
				int L =0;
				int R =N-1;
				int ijyou = 0;
				int ika = N-1;
				int mid = 0;
				int cstart = 0;
				int ok = 0;
				
				if(target<B[0]) {//B[i]でできるBの種類は全て
					cstart = 0;	
					//System.out.println("A["+i+"]はB["+0+"]より小さい");
					AZ[i] = N;
				}else if(target>=B[N-1]) {//B[i]でできる種類はない
					//System.out.println("A["+i+"]がBの全てより大きい");
					AZ[i] = 0;
					continue;
				}else {
					while(L<R) {
						 mid = (L+R)/2;
						 if(B[mid]==target) {						
							 cstart = mid+1;
							 ok=1;
							 break;
						 }else if(B[mid]>target) {
							R =mid;
							ika =mid;
						}else if(B[mid]<target) {
							L = mid+1;
							ijyou =mid;
						}
					}
				
					if(ok==0) {
						//System.out.println("A["+i+"]はB["+ijyou+"]より大きく　B["+ika+"]より小さい　");
						AZ[i] = N-1-ika+1;
					}else {
						//System.out.println("A["+i+"]はB"+mid+"等しい　");
						AZ[i] = N-1-(mid+1)+1;
					}
					cstart = ika;	
				}
				
			}
			/*
			
			for(int i = 0;i<N;i++) {
				System.out.print(AZ[i]+" ");
			}
			
			System.out.println();
			*/
			int souwa = 0;
			
			for(int i = 0;i<N;i++) {
				//System.out.print(a[AZ[i]]+" ");
				souwa+=a[AZ[i]];
			}
			
			
			
			System.out.println(souwa);
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}