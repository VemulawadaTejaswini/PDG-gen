import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] s = S.split("");
		
		int max = 0;
		int last = -1;
		for(int i=0; i<s.length; i++){
			if(!s[i].equals("A") && !s[i].equals("T") && !s[i].equals("C") && !s[i].equals("G")){
				int length = i-last-1;
				if(length > max){
					max = length;
				}
				last = i;
			}
		}
		int length = s.length-last-1;
		if(length > max){
			max = length;
		}
				
		System.out.println(max);
	}
}
