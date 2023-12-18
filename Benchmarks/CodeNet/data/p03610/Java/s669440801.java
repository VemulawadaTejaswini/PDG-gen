import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ss="";
		for(int i=0;i<s.length();i+=2){
			ss+=s.charAt(i);
		}
		System.out.print(ss);
	}
}
