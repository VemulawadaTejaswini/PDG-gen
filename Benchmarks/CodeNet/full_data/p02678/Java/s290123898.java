import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int rooms = scan.nextInt();
		int aisles = scan.nextInt();
		boolean avail[][] = new boolean[rooms+1][rooms+1];

		int a;
		int b;
		for(int i = 0; i < aisles; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			avail[a][b] = avail[b][a] = true;
		}

		int roots[] = new int[rooms+1];
		int k;
		int count = 1;
		a = 0;
		b = 0;
		int ro_rm[] = new int[rooms+1];
		ro_rm[0] = 1;
		while(b < rooms){
			k = ro_rm[b++];
			for(int j = 1; j < rooms+1; j++){
				if(avail[k][j] == true){
					if(roots[j] == 0 && j != 1){
						roots[j] = count;
						ro_rm[++a] = j;
					}
				}
			}

			if(b <= a){
				count++;
			}
		}

		for(int i = 2; i < rooms; i++){
			if(roots[i] == 0){
				System.out.println("No" + i);
				System.exit(0);
			}
		}

		System.out.println("Yes");
		for(int i = 2; i <= rooms; i++){
			System.out.println(roots[i]);
		}
		scan.close();
	}
}