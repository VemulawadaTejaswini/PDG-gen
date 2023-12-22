import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		while(true){
			String now=s.next();
			if(now.equals("apple"))System.out.print("peach");
			else if(now.equals("peach"))System.out.print("apple");
			else System.out.print(now);
			if(s.hasNext()){
				System.out.print(" ");
			}else{
				System.out.println();
				break;
			}
		}
	}
}