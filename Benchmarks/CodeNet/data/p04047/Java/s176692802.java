import java.util.*;

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> kushi = new ArrayList<Integer>();
		int n = scanner.nextInt();

		for(int i=0 ;i<2*n;i++){
			int l = scanner.nextInt();
			kushi.add(l);
		}

		Collections.sort(kushi);
		int sum=0;
		for(int i=0;i<2*n;i=i+2) sum=sum+kushi.get(i);

		System.out.println(sum); 

	}
}