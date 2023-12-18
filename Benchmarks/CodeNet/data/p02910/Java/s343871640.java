import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean f2 = true;
		for(int i = 0 ; i < s.length() ; ++i){
			char c = s.charAt(i);
			boolean f = false;
			if(i % 2 == 0){
				if(c == 'R' || c == 'U' || c == 'D'){
					f = true;
				}
			}else{
				if(c == 'L' || c == 'U' || c == 'D'){
					f = true;
				}				
			}
			if(!f){
				f2 = false;
				break;
			}
		}
		if(f2){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
