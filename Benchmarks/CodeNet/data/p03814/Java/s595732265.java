import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		String s=sc.next();
		int len=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				for(int k=i;k<s.length();k++){
					if(s.charAt(k)=='Z'){
						if(len<k-i+1) len=k-i+1;
					}
				}
			}
		}		
		
		System.out.println(len);

	}
}
