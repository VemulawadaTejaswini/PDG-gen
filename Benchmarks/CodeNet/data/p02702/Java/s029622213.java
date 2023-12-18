import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] po=new int[s.length()];
		po[0]=s.charAt(0) - '0';
		for(int i=1; i<s.length(); i++){
			po[i]=(po[i-1]*10 + s.charAt(i) -'0') % 2019;
		}
		Arrays.sort(po);
		int now =po[0];
		int vol=1;
		int sum=0;
		for(int i=1; i<po.length; i++) {
			if(po[i] != now) {
				sum += (vol-1)*vol/2;
				vol=1;
				now=po[i];
			}
			else {
				vol++;
			}
		}
		sum+=(vol-1)*vol/2;
		System.out.println(sum);
	}
}