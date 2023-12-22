import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()){
			
			int m = Integer.parseInt(sc.next());
			int f = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			
			if(m== -1 && f == -1 && r == -1 ){
				
				break;
			}
			
			sb.append(culculateRank(m,f,r));
			sb.append("\n");
			
		}
		System.out.print(sb);
		
		
	}

	private static String culculateRank(int m, int f, int r) {
		
		if(m == -1 || f == -1){
			return "F";
		}
		
		int sum = m + f;
		
		if(sum >= 80){
			
			return "A";
		}
		else if(65 <= sum && sum < 80){
			
			return "B";
		}
		else if(50 <= sum && sum < 65){
			
			return "C";
		}else if(30 <= sum && sum < 50){
			
			if( r>=50){
				return "C";
			}else{
				return "D";
			}
			
		}
		
		return "F";
	}
	
	

}

