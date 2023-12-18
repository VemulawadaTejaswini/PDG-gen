import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();
		char[] ch=s.toCharArray();
		int ch0=0;
		int ch1=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='0'){
				ch0++;
			}else{
				ch1++;
			}
		}
		System.out.println(Math.min(ch0, ch1)*2);
	}
}