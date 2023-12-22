import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = new int[n];
		int[] f = new int [n];
		int[] r = new int [n];
		int[] v = new int [n];
		for(int a = 0;a<n;a++){
			b[a] = scan.nextInt();
			f[a] = scan.nextInt();
			r[a] = scan.nextInt();
			v[a] = scan.nextInt();
		}
		int V[] = new int[120];
		int ka = 0;
		for(int g = 0;g<n;g++){
			for(int h = 1;h<=4;h++){
				for(int i = 1;i<=3;i++){
					for(int j = 1;j<=10;j++){
						if(b[g] == h && f[g] == i && r[g] == j){
							V[ka*10+j-1] = V[ka*10+j-1] + v[g];
						}
					}
					ka++;
				}
			}
			ka = 0;
		}
		int kb =0;
		for(int e =1;e<=4;e++){
			for(int c =1;c<=3;c++){
				for(int d = 1;d<=10;d++){
					System.out.print(" "+V[kb*10+d-1]);
				}
				System.out.println("");
				kb++;
			}
			if(e != 4){
				System.out.println("####################");
			}
		}
	}
}