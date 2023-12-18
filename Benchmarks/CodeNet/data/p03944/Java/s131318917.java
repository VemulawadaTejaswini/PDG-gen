import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
				
		
		
		for(int i=0; i<n; i++){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int a = sc.nextInt();
			if(a==1){
				x = x1;
			}else if(a==2){
				w = x1;
			}else if(a==3){
				y = y1;
			}else{
				h = y1;
			}
		}
		
		System.out.println((w-x)*(h-y));
		
		
		
	}

}