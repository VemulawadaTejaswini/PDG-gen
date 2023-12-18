import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if( A <= C && B >= C){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}