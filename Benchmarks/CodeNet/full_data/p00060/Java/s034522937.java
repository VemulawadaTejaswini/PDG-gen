import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int count = 0;
			for(int i=1;i<=10;i++){
				if(i!=a && i!=b && i!=c && a+b+i>20) count++;
			}
			if(count<=3) System.out.println("YES");
			else System.out.println("NO");	
		}
	}	
}