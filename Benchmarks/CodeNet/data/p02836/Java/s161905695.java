import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] pp=new char[s.length()/2];
		for(int i=0; i<s.length()/2; i++){
			pp[i]=s.charAt(i);
		}
		int count=0;
		for(int i=s.length()-1; i>(s.length()-1)/2; i--){
			if(pp[s.length()-1-i]!=s.charAt(i)){
				count++;
			}
		}
		System.out.println(count);
	}
}
