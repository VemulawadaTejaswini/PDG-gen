import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int k=sc.nextInt();
			int max=9;
			int count=9;
			int[] list=new int[k+1];
			for(int i=1; i<=k; i++) {
				list[i-1]=i;
			}
			if(k<=9) {
				for(int i=1; i<=k; i++) {
					System.out.println(k);
				}
			}
			else {
				for(int m=10; ; m++) {
					String str=String.valueOf(m);
					int strsum=0;
					for(int i=0; i<str.length(); i++) {
						strsum+=str.charAt(i)-'0';
					}
					int maxm=0;
					if(m==m/strsum) {
						maxm=m-1;
					}
					else {
						maxm=m/strsum;
					}
					if(maxm>max) {
						list[count]=m-1;
						count++;
					}
					if(count==k) {
						break;
					}
					
				}
				for(int i=0; i<k; i++) {
					System.out.println(list[i]);
				}
			}
			
		}
	}
}