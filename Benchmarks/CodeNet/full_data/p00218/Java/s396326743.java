import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			
			int a, b, c;
			for(int i=0;i<n;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				
				if(a==100 || b==100 | c==100){
					System.out.println("A");
				}else if((double)(a+b)/2>=90){
					System.out.println("A");
				}else if((double)(a+b+c)/3>=80){
					System.out.println("A");
				}else if((double)(a+b+c)/3>=70){
					System.out.println("B");
				}else if((double)(a+b+c)/3>=50 && (a>=80 || b>=80)){
					System.out.println("B");
				}else{
					System.out.println("C");
				}
			}
			
		}
	
	}	
}