import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Chara implements Comparable<Chara>{
		String name;
		int points;
		
		public Chara(String name, int points) {
			super();
			this.name = name;
			this.points = points;
		}

		@Override
		public int compareTo(Chara o) {
			if(this.points == o.points){
				return this.name.compareTo(o.name);
			}else{
				return this.points - o.points;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			boolean[][] data = new boolean[n][30];
			Chara[] charas = new Chara[n];
			
			for(int i = 0; i < n; i++){
				String name = sc.next();
				
				final int num = sc.nextInt();
				
				for(int j = 0; j < num; j++){
					data[i][sc.nextInt()] = true ;
				}
				
				charas[i] = new Chara(name, 0);
			}
			
			for(int i = 0; i < 30; i++){
				int count = n + 1;
				
				for(boolean[] array : data){
					if(array[i]){
						count--;
					}
				}
				
				if(count == n + 1){
					continue;
				}
				
				for(int j = 0; j < n; j++){
					if(data[j][i]){
						charas[j].points += count;
					}
				}
			}
			
			Arrays.sort(charas);
			
			System.out.println(charas[0].points + " " + charas[0].name);
		}
		
		sc.close();
	}
}