import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int a=sc.nextInt();
			if(a==0) {
				System.exit(0);
			}
			String[] ary=new String[a];
			int maxlen=0;
			for(int i=0; i<a; i++) {	//プリアンブル
				String s=sc.next();
				StringBuilder sb=new StringBuilder();
				sb.append(s.charAt(0));
				for(int k=0; k<s.length()-1; k++) {
					if(s.charAt(k)=='a'||s.charAt(k)=='i'||s.charAt(k)=='u'||s.charAt(k)=='e'||s.charAt(k)=='o') {
						sb.append(s.charAt(k+1));
					}
				}
				ary[i]=sb.toString();
				maxlen=Math.max(maxlen, ary[i].length());
				//System.out.println(ary[i]);
			}
			HashSet<String> airport=new HashSet<String>();
			boolean kan=false;
			for(int i=1; i<=maxlen; i++) {
				airport=new HashSet<String>();
				for(int j=0; j<a; j++) {
					String tmp=ary[j].substring(0, Math.min(i, ary[j].length()));
					if(airport.contains(tmp)) {
						break;
					}
					else {
						airport.add(tmp);
					}
					if(j==a-1) {
						System.out.println(i);
						kan=true;
						break;
					}
				}
				if(kan) {
					break;
				}
			}
			if(!kan) {
				System.out.println(-1);
			}
			/*HashSet<String> airport=new HashSet<String>();
			boolean kan=false;
			for(int i=1; i<=maxlen; i++) {
				for(int j=0; j<a; j++) {
					String tmp=ary[j].substring(0, Math.min(maxlen-1,Math.min(ary[j].length(),i)));
					if(airport.contains(tmp)) {
						break;
					}
					else {
						airport.add(tmp);
					}
					if(j==a-1) {
						System.out.println(i);
						kan=true;
						break;
					}
				}
				if(kan) {
					break;
				}
			}
			if(!kan) {
				System.out.println(-1);
			}*/
		}
	}
}
