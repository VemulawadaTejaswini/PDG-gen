import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean exit=true;
		int c = 0;
		while(exit==true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0)exit=false;
			if(exit==true){
				if(c!=0)System.out.println();
				c++;
				int count=0;
				for(int i=a;i<=b;i++){
					if(i%400==0 || (i%4==0 && i%100!=0)){
						System.out.println(i);
						count++;
					}
				}
				if(count==0)System.out.println("NA");	
			}
		}

	}
}