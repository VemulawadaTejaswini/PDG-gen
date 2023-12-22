import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++){
				String s = sc.nextLine();
				System.out.println(s.replace("Hoshino", "Hoshina"));
			}
		}
	}	
}