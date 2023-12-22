import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Mono implements Comparable<Mono>{
		String name;
		double kouritu;
		
		
		public Mono(String name, double kouritu) {
			super();
			this.name = name;
			this.kouritu = kouritu;
		}

		@Override
		public int compareTo(Mono arg0) {
			if(this.kouritu > arg0.kouritu){
				return -1;
			}else if(this.kouritu < arg0.kouritu){
				return 1;
			}else{
				return this.name.compareTo(arg0.name);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			Mono[] monos = new Mono[N];
			
			for(int i = 0; i < N; i++){
				String name = sc.next();
				int price = sc.nextInt();
				int atl = sc.nextInt() + sc.nextInt() + sc.nextInt();
				int mi = sc.nextInt() + sc.nextInt();
				int kazu = sc.nextInt();
				int sold = sc.nextInt();
				int times = sc.nextInt();
				
				int time = atl + times * mi;
				
				int rieki = kazu * times * sold - price;
				
				monos[i] = new Mono(name, rieki/(double)(time));
			}
			
			Arrays.sort(monos);
			
			for(Mono m : monos){
				System.out.println(m.name);
			}
			
			System.out.println("#");
		}
		
	}

}