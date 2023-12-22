import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
	static class Plant{
		String name;
		int P, A, B, C, D, E, F, S, M;
		int rieki, time;
		Plant(String str, int p, int a, int b, int c, int d, int e, int f, int s, int m){
			name = str;
			P = p;
			A = a;
			B = b;
			C = c;
			D = d;
			E = e;
			F = f;
			S = s;
			M = m;
			time = a+b+c;
			for(int i=0; i<m; i++){
				time += (d+e);
			}
			rieki = m*f*s - p;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			Plant[] plants = new Plant[data];
			for(int i=0; i<data; i++){
				plants[i] = new Plant(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
									  sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}

			Arrays.sort(plants, new Comparator<Plant>(){
				public int compare(Plant a, Plant b){
					if(a.rieki*b.time - b.rieki*a.time>0){
						return -1;
					}else if(a.rieki*b.time - b.rieki*a.time<0){
						return 1;
					}else{
						return a.name.compareTo(b.name);
					}
				}
			});

			for(int i=0; i<data; i++){
				System.out.println(plants[i].name);
			}
			System.out.println("#");
		}
	}
}