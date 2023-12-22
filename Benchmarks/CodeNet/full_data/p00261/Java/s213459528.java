import java.util.Scanner;

public class Main{
	static char city;
	static int flag;
	
	public static void check(int nn){
		if(nn==0){
			if(city=='A') {city='X'; flag=0;}
			else if(city=='B') {city='Y'; flag=0;}
			else if(city=='X') {flag=2;}
			else if(city=='Y') {city='X'; flag=0;}
			else if(city=='Z') {city='W'; flag=0;}
			else if(city=='W') {city='B'; flag=1;}
		}
		else if(nn==1){
			if(city=='A') {city='Y'; flag=0;}
			else if(city=='B') {city='X'; flag=0;}
			else if(city=='Y') {flag=2;}
			else if(city=='X') {city='Z'; flag=0;}
			else if(city=='Z') {city='B'; flag=1;}
			else if(city=='W') {city='Y'; flag=0;}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			city='A';
			flag=0;
		
			String s = sc.next();
			if(s.equals("#")) break;
			
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				int n = Integer.parseInt(""+c);
				
				//System.out.println("city:"+ city + " flag:" + flag); 
				
				check(n);
				if(flag==2) break;
			}
			if(flag==1) System.out.println("Yes");
			else System.out.println("No");
		}
		
	}

}