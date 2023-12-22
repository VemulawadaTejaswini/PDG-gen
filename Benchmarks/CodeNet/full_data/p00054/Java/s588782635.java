import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			
			for(int i=0;i<=n;i++){
				if(i!=0)sum+=a/b;
				a = (a%b)*10;
			}
			System.out.println(sum);
			
		}
	}
}