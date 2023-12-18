import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String st = as.next(); 
		int n = Integer.parseInt(as.next());
		int k = 0;
		for(int i=0;i<n;i++){
			int a = Integer.parseInt(as.next());
			if(a == 1){
				k++;
			}else{
				int b = Integer.parseInt(as.next());
				if(b == 1&&k%2==0){
					st = as.next() + st;
				}else if(b == 1&&k%2==1){
					st = st + as.next();
				}else if(b == 2&&k%2==1){
					st = as.next() + st;
				}else if(b == 2&&k%2==0){
					st = st + as.next();
				}
			}
		}
		if(k%2==0){
			System.out.println(st);
		}else{
			StringBuffer str = new StringBuffer(st);
			System.out.println(str.reverse().toString());
		}
	}
}