import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> point = new ArrayList<ArrayList<Integer>>();
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			
			for (int j = 0; j < d ; j++) {
				
				array.add(sc.nextInt());
				
			}
			point.add(array);
		}
		
		
		
		
		int count= 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i+1 ; j < n; j++) {
				double distance = 0.0;
				for(int k = 0; k < d ; k++) {
					
					distance += Math.pow(point.get(i).get(k)-point.get(j).get(k), 2);
					
					
				}
				
				distance = Math.sqrt(distance);
				
				if(Math.ceil(distance) == Math.floor(distance)) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
		
	}

}
