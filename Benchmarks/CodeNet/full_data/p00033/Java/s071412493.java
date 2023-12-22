import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		int  count =  sc.nextInt();
		for(int  i = 0; i<count;i++){
			boolean d = true;
			int  a = 0;
			int  b = 0;
			for(int c = 0;c<10;c++){
				int p = sc.nextInt();
				if(a < p ){
					a = p;
				}else if(b < p){
					b = p;
				} else {
					d = false;
					//System.out.println(d);
				}
			}
			System.out.println(d);
			if(d == true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
	}
}