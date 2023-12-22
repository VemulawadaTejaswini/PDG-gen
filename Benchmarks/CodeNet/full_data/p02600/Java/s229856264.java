import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		if(num>=400&&num<=599){
			System.out.println(8);
			return;
		}else if(num>=600&&num<=799){
			System.out.println(7);
			return;
		}else if(num>=800&&num<=999){
			System.out.println(6);
			return;
		}else if(num>=1000&&num<=1199){
			System.out.println(5);
			return;
		}else if(num>=1200&&num<=1399){
			System.out.println(4);
			return;
		}else if(num>=1400&&num<=1599){
			System.out.println(3);
			return;
		}else if(num>=1600&&num<=1799){
			System.out.println(2);
			return;
		}else{
			System.out.println(1);
			return;
		}
		
	}
}