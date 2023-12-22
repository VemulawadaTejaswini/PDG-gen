mport java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int L=0,R=0;
		for (int i=0;i<n;i++) {
			String s1=sc.next();
			String s2=sc.next();
			
			if (s1.compareTo(s2)==0) {
				L++;
				R++;
			}
			else if(s1.compareTo(s2)<0) {
				L=L+3;
			}
			else {
				R=R+3;
			}
		}
		
		System.out.println(R + " "+ L);
				sc.close();
	}

}
