import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int b=sc.nextInt();
			int c=0;
			boolean clear = true;
			for(int j=1;j<10;j++){
				int x = sc.nextInt();
				if(x < b && x < c){
					clear = false;
					break;
				}else if(x > b && x < c){
					b=x;
				}else if(x < b && x > c){
					c=x;
				}else{
					if(x-b>x-c){
						c=x;
					}else if(x-c>x-b){
						b=x;
					}
				}
			}
			if(clear==true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	
	}
}