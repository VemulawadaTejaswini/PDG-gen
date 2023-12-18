import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String st = as.next(); 
		int n = Integer.parseInt(as.next());
		for(int i=0;i<n;i++){
			int a = Integer.parseInt(as.next());
			if(a == 1){
				StringBuffer str = new StringBuffer(st);
		        st = str.reverse().toString();
			}else{
				int b = Integer.parseInt(as.next());
				if(b == 1){
					st = as.next() + st;
				}else{
					st = st + as.next();
				}
			}
		}
		System.out.println(st);
	}
}