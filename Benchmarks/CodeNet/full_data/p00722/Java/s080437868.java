import java.util.*;


public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true){
				int a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();

				if(a==0&&d==0&&n==0){
					sc.close();
					break;
				}

				int index = 0;
				while(true){
					if(prime(a)){
						index++;
					}
					if(index==n) break;
					a += d;
				}

				System.out.println(a);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean prime(int a){
		if(a==1) return false;
		int limit = (int)Math.sqrt(a);

		boolean p = true;
		for(int i=2;i<=limit;i++){
			if(a%i==0){
				p = false;
				break;
			}
		}

		return p;
	}
}