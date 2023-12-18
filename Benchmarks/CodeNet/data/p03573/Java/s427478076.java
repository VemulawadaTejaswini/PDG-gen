import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		if(a==b){
			System.out.println(c);
			return;
		}else if(a==c){
			System.out.println(b);
			return;
		}else{
			System.out.println(a);
		}
		sc.close();
		return;
	}
}