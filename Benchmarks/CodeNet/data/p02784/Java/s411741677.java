import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		int n = sc.nextInt();
		
		long p = 0L;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			p+=a;
		}
		sc.close();

		if(p>=h){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}