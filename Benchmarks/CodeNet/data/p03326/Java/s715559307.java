import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		long X[][]=new long[N][2];
		long Y[][]=new long[N][2];
		long Z[][]=new long[N][2];
		long X2[][]=new long[N][2];
		long Y2[][]=new long[N][2];
		int z=0,ir=-1;
		long max=0,max2=0,max3=0,max4=0;
		while(z<N){
			X[z][0]=stdIn.nextLong();
			Y[z][0]=stdIn.nextLong();
			Z[z][0]=stdIn.nextLong();
			X[z][1]=z;
			Y[z][1]=z;
			Z[z][1]=z;
			X2[z][0]=X[z][0];
			Y2[z][0]=Y[z][0];
			X2[z][1]=z;
			Y2[z][1]=z;
			z++;
		}z=0;
		Arrays.sort(X, (a, b) -> Long.compare(a[0], b[0]));
		while(z<M){
			max+=X[z][0];
			z++;
		}z=0;
		while(z<M){
			max2+=X[N-z-1][0];
			z++;
		}z=0;
		if(max<0)
			max*=ir;
		if(max2<0)
			max2*=ir;
		if(max<max2){
			max=max2;
			ir=1;
		}max2=0;
		if(ir==1){
			while(z<M){
				max2+=Y[(int)X[N-z-1][1]][0];
				z++;
			}z=0;
			if(max2<0)
				max2*=-1;
			max+=max2;max2=0;
			while(z<M){
				max2+=Z[(int)X[N-z-1][1]][0];
				z++;
			}z=0;
			if(max2<0)
				max2*=-1;
			max+=max2;max2=0;ir=-1;
		}
		else{
			while(z<M){
				max2+=Y[(int)X[z][1]][0];
				z++;
			}z=0;
			if(max2<0)
				max2*=-1;
			max+=max2;max2=0;
			while(z<M){
				max2+=Z[(int)X[z][1]][0];
				z++;
			}z=0;
			if(max2<0)
				max2*=-1;
			max+=max2;max2=0;ir=-1;
		}
		Arrays.sort(Y, (a, b) -> Long.compare(a[0], b[0]));
		while(z<M){
			max2+=Y[z][0];
			z++;
		}z=0;
		while(z<M){
			max3+=Y[N-z-1][0];
			z++;
		}z=0;
		if(max2<0)
			max2*=ir;
		if(max3<0)
			max3*=ir;
		if(max2<max3){
			max2=max3;
			ir=1;
		}max3=0;
		if(ir==1){
			while(z<M){
				max3+=X2[(int)Y[N-z-1][1]][0];
				z++;
			}z=0;
			if(max3<0)
				max3*=-1;
			max2+=max3;max3=0;
			while(z<M){
				max3+=Z[(int)Y[N-z-1][1]][0];
				z++;
			}z=0;
			if(max3<0)
				max3*=-1;
			max2+=max3;max3=0;ir=-1;
		}
		else{
			while(z<M){
				max3+=X2[(int)Y[z][1]][0];
				z++;
			}z=0;
			if(max3<0)
				max3*=-1;
			max2+=max3;max3=0;
			while(z<M){
				max3+=Z[(int)Y[z][1]][0];
				z++;
			}z=0;
			if(max3<0)
				max3*=-1;
			max2+=max3;max3=0;ir=-1;
		}
		Arrays.sort(Z, (a, b) -> Long.compare(a[0], b[0]));
		while(z<M){
			max3+=Z[z][0];
			z++;
		}z=0;
		while(z<M){
			max4+=Z[N-z-1][0];
			z++;
		}z=0;
		if(max3<0)
			max3*=ir;
		if(max4<0)
			max4*=ir;
		if(max3<max4){
			max3=max4;
			ir=1;
		}max4=0;
		if(ir==1){
			while(z<M){
				max4+=X2[(int)Z[N-z-1][1]][0];
				z++;
			}z=0;
			if(max4<0)
				max4*=-1;
			max3+=max4;max4=0;
			while(z<M){
				max4+=Y2[(int)Z[N-z-1][1]][0];
				z++;
			}z=0;
			if(max4<0)
				max4*=-1;
			max3+=max4;max4=0;ir=-1;
		}
		else{
			while(z<M){
				max4+=X2[(int)Z[z][1]][0];
				z++;
			}z=0;
			if(max4<0)
				max4*=-1;
			max3+=max4;max4=0;
			while(z<M){
				max4+=Y2[(int)Z[z][1]][0];
				z++;
			}z=0;
			if(max4<0)
				max4*=-1;
			max3+=max4;max4=0;ir=-1;
		}
		if(max<=max2&&max3<=max2)
			System.out.println(max2);
		else
			if(max2<=max&&max3<=max)
				System.out.println(max);
			else
				System.out.println(max3);
	}

}
