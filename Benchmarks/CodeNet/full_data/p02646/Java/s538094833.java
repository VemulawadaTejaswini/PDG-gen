import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		int adash=0, bdash=0;
      
		if(A<B){
			adash = A+V*T;
			bdash = B+W*T;
			if(adash>=bdash){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else if(A>B){
			adash = A-V*T;
			bdash = B-W*T;
			if(adash<=bdash){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			System.out.println("YES");
		}
    }
}
