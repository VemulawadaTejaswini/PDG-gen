import java.util.Arrays;
import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String[] s=new String[N];
	for(int i=0;i<N;i++) {
		s[i]=sc.next();
	}
	String[] s2=new String[N];
	int count=0;
	int s2num[]=new int[N];
	int ans=0;
	for(int i=0;i<N;i++) {
		char[] chars=s[i].toCharArray();
		Arrays.sort(chars);
		String tmp=new String(chars);

		if(count==0) {
				s2[count]=tmp;
				count++;
				continue;
			}
		for(int j=0;j<count;j++) {
			if(tmp.equals(s2[j])) {
				s2num[j]++;
				break;
			}
			if(j==count-1) {
				s2[count]=tmp;
				count++;
				break;
			}
		}

	}
	for(int j=0;j<count;j++) {
		ans+=s2num[j]*(s2num[j]+1)/2;
	}
System.out.println(ans);
}
}
