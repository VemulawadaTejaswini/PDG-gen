import java.util.*;
public class Main {
	static String input = new String();
	static String syori(char num,char target){
		String a="";
		int n=Integer.parseInt(num+"");
		for(int i=0;i<n;i++)a+=target;
		return a;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			input = in.next();
			String result = "";
			for(int s=0;s<input.length();s++){
				if(input.charAt(s)!='@')result+=input.charAt(s);
				else{
					result+=syori(input.charAt(s+1),input.charAt(s+2));
					s+=2;
				}
			}
			System.out.println(result);
		}
	}
}