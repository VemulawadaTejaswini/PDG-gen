import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int h=sc.nextInt();
		//int w=sc.nextInt();
		//int[][] res=new int[h][w];
		//long n=sc.nextLong(),y=sc.nextLong();
		char buffs='z',bufft='a';
		String s= sc.next();
		String t=sc.next();
		StringBuilder s1=new StringBuilder(s);
		StringBuilder t1=new StringBuilder(t);

		for(int i=0;i<1000;i++) {
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)<=buffs) {
					buffs=s1.charAt(j);
					s1.deleteCharAt(j);
				}
			}
			for(int k=0;k<t1.length();k++) {
				if(t1.charAt(k)>=bufft) {
					bufft=t1.charAt(k);
					t1.deleteCharAt(k);
				}
			}

			if(buffs<bufft) {
				System.out.println("Yes");
				System.exit(0);
			}else if(buffs>bufft){
				System.out.println("No");
				System.exit(0);
			}
			if(s1.length()>0) {
				buffs='z';
			}
			if(t1.length()>0) {
				bufft='a';
			}
		}
		if(s.length()<t.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
