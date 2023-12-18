import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N=teclado.nextInt(),X=teclado.nextInt();
		int quant=0;
		int v[] = new int[N];
		int r[] = new int[N+1];
		for(int y = 0; y<N;y++) {
			v[y]=teclado.nextInt();
			}
		r[0]=0;
		for(int y=1; y<= N; y++) {
			int z = y-1;
			r[y]= r[z] + v[z];
			
		}
		for(int y=0;y<=N;y++) {
			if(r[y]<=X) {
				quant = quant+1;
			}
		}
		System.out.println(quant);
	}
}
