import java.util.*;
public class Main{
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	void bc(){
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static void main(String[] args){     
		new Main().bc();     
		} 
	}