import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans=s.length();
		int count0=0;
		int count1=0;
		int count2=1;
		int b=0;
		char a='2';
		for(int i = 0; i<s.length(); i++){
			if(a==s.charAt(i)){
				count2++;
			}else{
				ans=Math.min(ans,count2+1);
				count2=1;
				b++;
			}
			if(s.charAt(i)=='1'){
				count1++;
			}else{
				count0++;
			}
			a=s.charAt(i);
		}
		if(b>1){
			System.out.println(Math.max(count1, count0));
		}else{
			System.out.println(ans);
		}
	}
}