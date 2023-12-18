import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		for(int i=0;i<k-1;i++){
			StringBuffer sb = new StringBuffer(str);
			str = str+sb.reverse();
			String s1 = str.substring(0,n);
			for(int j=1;j<=n;j++){
				String s2 = str.substring(j,n+j);
				if(s1.compareTo(s2)>0){
					s1 = s2;
				}
			}
			sb = new StringBuffer(s1);
			str = ""+sb.reverse();
		}
		StringBuffer sb = new StringBuffer(str);
		str = str+sb.reverse();
		String s1 = str.substring(0,n);
		for(int i=1;i<=n;i++){
			String s2 = str.substring(i,n+i);
			if(s1.compareTo(s2)>0){
				s1 = s2;
			}
		}
		System.out.println(s1);
  }
}