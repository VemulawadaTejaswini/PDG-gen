import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		int  a = 0;
		int  b = 0;
		int  count =  sc.nextInt();
		for(int  i = 0; i<count;i++){
			for(int c = 0;c<10;c++){
				int p =  sc.nextInt();
				if(a < p ){
					a = p;
				}else if(b < p){
					b = p;
				} else {
					System.out.println("NO");
					break;
				}
				if(c == 9){
					System.out.println("YES");
				}
			}
		}
		
	}
}