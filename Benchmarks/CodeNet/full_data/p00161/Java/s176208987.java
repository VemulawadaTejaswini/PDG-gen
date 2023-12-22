import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	static class Team implements Comparable<Team>{
		int number;
		int time;
		
		Team(int n, int t){
			number = n;
			time = t;
		}
		
		@Override
		public int compareTo(Team arg0) {
			return Integer.valueOf(this.time).compareTo(Integer.valueOf(arg0.time));
		}
		
		@Override
		public String toString(){
			return Integer.toString(number);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Team[] array = new Team[n];
			
			for(int i = 0; i < n; i++){
				int number = sc.nextInt();
				int time = sc.nextInt()*60 + sc.nextInt()
						 + sc.nextInt()*60 + sc.nextInt()
						 + sc.nextInt()*60 + sc.nextInt()
						 + sc.nextInt()*60 + sc.nextInt();
				array[i] = new Team(number, time);
			}
			
			Arrays.sort(array);
			
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[n-2]);
		}
		
	}

}