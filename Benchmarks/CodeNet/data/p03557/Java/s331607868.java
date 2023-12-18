import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int C[]=new int[N];
		int b[]=new int[N];
		int z=0,y=0,ans=0,an=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			b[z]=1;
			z++;
		}z=0;
		while
			(z<N){
			B[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			C[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		while(z<N){
			while(y<N){
				if(A[y]>=B[z]){
					break;
				}
				y++;
			}
			b[z]=y;
			z++;
		}z=0;y=0;
		while(z<N){
			while(y<N){
				if(B[y]>=C[z]){
					break;
				}
				an+=b[y];
				y++;
			}
			ans+=an;
			z++;
		}
		System.out.println(ans);
	}
}