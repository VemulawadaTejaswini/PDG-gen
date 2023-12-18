import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int firsta=a,firstb=b;
		boolean araretsu=false;
		boolean braretsu=false;
		String str1 = "", str2 = "";
		if(n%2==1) {
			a-=m/2;
			n-=1;
			araretsu=true;
		}
		if(m%2==1) {
			if(!araretsu)
				b-=n/2;
			else
				b=b-n/2+1;
			m-=1;
			braretsu=true;
		}

		n=n/2;
		m=m/2;
		if(n*m<a/2+b/2) {
			System.out.print("NO");
		}
		else {
			System.out.println("YES");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {

					if(a>0) {
						str1+="<>";
						if(a==1)
							str2+="..";
						else
							str2+="<>";
						a-=2;
					}
					else {
						if(b>0) {
							if(b==1) {
								str1+="^.";
								str2+="v.";
							}
							else {
								str1+="^^";
								str2+="vv";
							}
							b-=2;
						}
						else {
							str1+="..";
							str2+="..";
						}
					}
				}
				if(braretsu) {
					if(firstb>0) {
						str1+="^";
						str2+="v";
						firstb--;
					}
					else {
						str1+=".";
						str2+=".";
					}
				}
				System.out.println(str1);
				System.out.println(str2);
				str1="";
				str2="";
			}

			if(araretsu) {
				for(int i=0;i<m/2;i++) {
					if(firsta>0) {
						str1+="<>";
						firsta--;
					}
					else {
						str1+="..";
					}
					str1+="<>";
				}
				if(braretsu) {
					str1+=".";
				}
				System.out.println(str1);
			}
		}



	}

}
