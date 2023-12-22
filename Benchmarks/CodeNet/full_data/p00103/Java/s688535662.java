import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			int a=0,r=0,p=0;
			while(a<3){
				String t = stdIn.next();
				if(t=="HIT"){
					r++;
					if(r>3){
						r--;p++;
					} 
				}else if(t=="OUT") {
					a++;
				} else {
					p+=r+1;
					r=0;
				}
			}
			System.out.println(p);
		}
	}
}