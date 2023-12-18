import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if(x == 1 || x == n*2-1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
			for(int i=n; i<n*2; i++){
				if(i!=x){
					//System.out.println(i);
					out.println(i);
				}
				if(i%100 == 0){
					out.flush();
				}
			}
			out.flush();
			//System.out.println(x);
			out.println(x);
			for(int i=1; i<n; i++){
				if(i!=x){
					//System.out.println(i);
					out.println(i);
				}
				if(i%100 == 0){
					out.flush();
				}
			}
		}
		out.flush();
	}

}