import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		String str[]=new String[a.length()];
		for(int i=0;i!=a.length();i++) {
			char abc=a.charAt(i);
			str[i]=String.valueOf(abc);
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int ans=0;
		for(int i=0;i!=a.length();i++) {
			if(str[i].equals("k")&&count1!=1) {
				if(count7==1) {
					count8=1;
				}
				count1=1;
				continue;
			}
			if(str[i].equals("e")&&count1==1&&count2!=1) {
				if(count7==1) {
					count8=1;
				}
				count2=1;
				continue;
			}
			if(str[i].equals("y")&&count2==1&&count3!=1) {
				if(count7==1) {
					count8=1;
				}
				count3=1;
				continue;
			}
			if(str[i].equals("e")&&count3==1&&count4!=1) {
				if(count7==1) {
					count8=1;
				}
				count4=1;
				continue;
			}
			if(str[i].equals("n")&&count4==1&&count5!=1) {
				if(count7==1) {
					count8=1;
				}
				count5=1;
				continue;
			}
			if(str[i].equals("c")&&count5==1&&count6!=1) {
				if(count7==1) {
					count8=1;
				}
				count6=1;
				continue;
			}
			if(str[i].equals("e")&&count6==1) {
				ans=1;
				break;
			}
			if(count8==1) {
				ans=0;
				break;
			}
			count7=1;
		}
		if(ans==1) {
		System.out.println("YES");
}
		else {
			System.out.println("NO");
		}
		}
	}