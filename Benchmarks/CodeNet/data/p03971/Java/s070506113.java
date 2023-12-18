import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		in.nextLine();
		String S = in.nextLine();
		
		int a = 0;
		int b = 0;
		for(int i = 0;i<S.length();i++){
			if(S.charAt(i)=='a'){
				if(a+b<A+B){
					System.out.println("Yes");
					a++;
				}
				else{
					System.out.println("No");
				}
			}
			else if(S.charAt(i)=='b'){
				if(a+b<A+B && b<B){
					System.out.println("Yes");
					b++;
				}
				else{
					System.out.println("No");
				}
			}
			else{
				System.out.println("No");
			}
		}
		return;
	}
	
}