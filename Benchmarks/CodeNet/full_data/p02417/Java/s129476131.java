import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] alpha=new int[26];
		for(int i=0;i<str.length();i++){
			alpha[Character.getNumericValue(str.charAt(i))-10]++;
		}
		for(int i=0;i<26;i++){
			System.out.println((char)(i+97)+" : "+alpha[i]);
		}
	}
}
