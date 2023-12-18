import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		char[] son = {'K' , 'I' , 'H' , 'B' , 'R'};
		int cnt = 0;
		boolean a = false;
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		for( char c : s.toCharArray()){
			if(a){
				if( c == 'A'){
					System.out.println("NO");
				}
				
			}else{
				if(c == son[cnt]){
					++cnt;
				}else{
					System.out.println("NO");
					return;
				}
			}
		}
		
		System.out.println("YES");
	}
}