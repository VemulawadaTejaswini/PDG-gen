import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		long k=sc.nextLong();
		long count=0;
		for(int i=0; i<s.length-1; i++){
			if(s[i]==s[i+1]){
				count++;
				s[i+1]='1';
			}
		}
		int ii=0;
		if(s[s.length-1]==s[0]){
			ii++;
		}
		System.out.println(count*k+(ii)*(k-1));
	}
}
