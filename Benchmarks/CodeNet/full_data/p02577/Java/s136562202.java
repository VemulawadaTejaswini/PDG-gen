import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String c;
		int b = 0;
		for(int i = 0; i < a.length(); i++){
			c = a.substring(i,i + 1);
			if(c.equals("1")){
				b += 1;
			}
			if(c.equals("2")){
				b += 2;
			}
			if(c.equals("3")){
				b += 3;
			}
			if(c.equals("4")){
				b += 4;
			}
			if(c.equals("5")){
				b += 5;
			}
			if(c.equals("6")){
				b += 6;
			}
			if(c.equals("7")){
				b += 7;
			}
			if(c.equals("8")){
				b += 8;
			}
		}
      if(b % 9 == 0){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
		
		
		
	}
}