import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		sc.next();
		HashSet<String> str = new HashSet<String>();
		String[] s = new String[N];
		for(int i =0;i<N;i++){
			String ss =sc.next();
			s[i] = ss;
			str.add(ss);
		}
		int M = sc.nextInt();
		String[] t = new String[N];
		sc.next();
		for(int i =0;i<M;i++){
			String ss =sc.next();
			t[i] = ss;
			str.add(ss);
		}
		
		String[] st = str.toArray(new String[0]);
		int[] sb=new int[str.size()];
		int[] sr =new int[str.size()];
		for(int i =0;i<str.size();i++){
			sb[i]=0;
			sr[i]=0;
		}
		for(int i =0;i<str.size();i++){
			for(int j =0;j<N;j++){
				if(st[i].equals(s[j])){
					sb[i]++;
				}
				if(st[i].equals(t[j])){
					sr[i]++;
				}
			}
		}
		int ans=0;
		for(int i =0;i<str.size();i++){
			ans=Math.max(ans,sb[i]-sr[i]);
		}
		System.out.println(ans);
 		sc.close();
	}
}
