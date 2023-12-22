import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int[] Num = new int[11];
		
		Scanner n = new Scanner(System.in);
		
		int a=n.nextInt();
		int b=n.nextInt();
		int c=0;
		while (a != 0 || b != 0){
			
			Num[c] = a;
			Num[c+1] = b;
			
			c = c + 2;
			
			a=n.nextInt();
			b=n.nextInt();
		}
		
		for (int d=(c-1);d>=0;d--){
			for (int e=0;e<d;e++){
					if (Num[e]>Num[e+1]){
					Num[10]=Num[e];
					Num[e]=Num[e+1];
					Num[e+1]=Num[10];
					}
			}
		}
		for (int f = 0; f < (c-1); f=f+2){
			System.out.println(Num[f]+" "+Num[f+1]);
			
		}
		
	}

}