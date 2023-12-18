	import java.util.*;
	class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int[][] a = new int[3][3];
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					a[i][j] = sc.nextInt();
			int n = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < n; i++)
				set.add(sc.nextInt());
			int count = 0, countd = 0;
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					//~ System.out.println(a[i] + " 2 " );
					if(set.contains(a[i][j]) && i != j){
						count++;
						//~ System.out.println(a[i][j] + " 1 ");
					} if(i == j){
							if (set.contains(a[i][j])){
									countd++;
									//~ System.out.println(a[i][j] + " 2 " );
							}
					}
				}
			}
			if(count + countd >= 3 && countd > 0)
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
	}
