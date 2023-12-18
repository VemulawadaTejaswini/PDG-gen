import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int l=s.length();
		char[] c=s.toCharArray();
		
		String list[]=new String[l*k];
		for(int i=0;i<l*k;i++) {
			list[i]="zzzzz";
		}
		for(int i=1;i<=k;i++) {
			for(int j=0;j<=l-i;j++) {
				list[j+(i-1)*l]=s.substring(j, j+i);
			}
		}
		
		Arrays.sort(list);
		int count=0;
		String S="zzzzzz";
		for(int i=0;i<list.length;i++) {
			if(S.equals(list[i])) {
				continue;
			}
			else {
				S=list[i];
				count++;
				if(count==k) {
					System.out.println(S);
					return;
				}
			}
		}
		
	}
	

}
