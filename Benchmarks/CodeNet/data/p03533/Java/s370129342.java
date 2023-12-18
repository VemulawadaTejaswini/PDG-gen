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
					return;
				}
				
				a = true;

			}else{
				if( c == 'A' ){
					a = true;
					continue;
				}
				if(cnt > son.length-1){
					System.out.println("NO");
					return;
				}
				if(c == son[cnt]){
					if( son[cnt] == 'R'){
						System.out.println("YES");
						return;
					}
					++cnt;
					a= false;
				}else{
					System.out.println("NO");
					return;
				}
			}
		}

		System.out.println("YES");
	}
}