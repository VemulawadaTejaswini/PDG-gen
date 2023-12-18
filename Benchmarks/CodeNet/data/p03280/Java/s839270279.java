import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		long k=sc.nextLong();
		int i=0;
		int count=0;
		char x='1';
		while(i<s.length){
			if(s[i]=='1'){
				count++;
			}else{
				x=s[i];
				break;
			}
			i++;
		}
		if(k<=count){
			System.out.println(1);
		}else{
			System.out.println(x);
		}
		
	}
}