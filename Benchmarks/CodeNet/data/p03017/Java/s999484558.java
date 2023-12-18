import java.util.*;


public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int a = scan.nextInt() - 1;
		int b = scan.nextInt() - 1;
		int c = scan.nextInt() - 1;
		int d = scan.nextInt() - 1;
		char[] road = scan.next().toCharArray();
		
		// search
		if(c < d){
			String answer = "Yes";
			boolean memory = false;
			for(int i = a; i <= d; i++){
				if(road[i] == '#' && memory == true){
					answer = "No";
				} else if (road[i] == '#'){
					memory = true;
				} else {
					memory = false;
				}
			}
			System.out.println(answer);
		} else {
			String answer = "Yes";
			boolean memory = false;
			for(int i = a; i <= c; i++){
				if(road[i] == '#' && memory == true){
					answer = "No";
				} else if (road[i] == '#'){
					memory = true;
				} else {
					memory = false;
				}
			}
			if(answer.equals("Yes")){
				answer = "No";
				for(int i = b; i <= d - 2; i++){
					if(road[i] == '.' && road[i+1] == '.' && road[i+2] == '.' ){
						answer = "Yes";
					}
				}
			}
			System.out.println(answer);
		}

	}
	
}