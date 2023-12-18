
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 String str=sc.next();
		 String str2=sc.next();
		 
		 if(str.length()-str2.length()==1){
		 	for(int i=0;i<str2.length();i++){
				if(str.charAt(i)!=str2.charAt(i)){
					System.out.print("No");
					System.exit(0);
				}
		 	}
		}
		System.out.print("Yes");
	}
}