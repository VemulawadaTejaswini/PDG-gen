import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		//System.out.println(S.substring(0,3));
		//System.out.println(S.substring(3));
		int max=0;
		Boolean tmp=true;
		for(int i=0;i<N-1;i++) {
			//System.out.println(i);
			if(N-i/2<=max) {
				break;
			}

			for(int j=0;j<(N-i)/2+1;j++) {
				String subS=S.substring(i, i+j+1);
				String after=S.substring(i+j+1);
				if(!after.contains(subS)) {
					/*
					System.out.println(subS);
					System.out.println(after);
					System.out.println(tmp);
					System.out.println();
					//i=i+j;
					 */
					if(j==0||i+j+1>=N||!tmp) {
						i=i+j;
						break;
					}else {
						i++;
						j--;
						tmp=false;
					}
				}else if(max<subS.length()) {
					max=subS.length();
					tmp=true;
				}else {
					tmp=true;
				}
			}
		}
		System.out.println(max);
	}
}
