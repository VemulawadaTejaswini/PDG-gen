import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < n; i++){
				list.add(i + 1);
			}
			
			int current = m - 1;
			
			while(list.size() > 1){
//				System.out.println("remove "+list.get(current));
				list.remove(current);
				
				current = (current + k - 1)%list.size();
//				System.out.println("next index is "+current);
			}
			
			System.out.println(list.get(0));
		}
	}

}

