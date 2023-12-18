import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] as = new int[n];
		int count = 0;
		
		for(int i=0; i<as.length; i++) {
			as[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(as);
		
		for(int i=0; i<as.length; i++) {
			boolean bool = true;
			while(i!=as.length-1 && as[i]==as[i+1]) {
				bool = !bool;
				i++;
			}
			
			if(bool) {
				count++;
			}
				
		}
		
		System.out.println(count);

	}

}