import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			for(int i=1;i<=n;i++){
				if(a<=c*i && b<=d*i){
					System.out.println(n-i);
					break;
				}
			}
			
		}
	}
}