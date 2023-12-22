import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			String t = sc.next();
			if(s.length()>t.length()){
				String u = s;
				s = t;
				t = u;
			}
			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			
			int max = 0;
			int count = 0;
			
			for(int i=0;i<a.length;i++){
				if(max>a.length-1-i) break;
				for(int j=0;j<b.length;j++){
					if(max>b.length-1-j) break;
					if(a[i]==b[j]){
						count = 0;
						for(int k=0;;k++){
							if(i+k==a.length || j+k==b.length || a[i+k]!=b[j+k]) break;
							if(a[i+k]==b[j+k]) count++;
						}
						max = Math.max(max, count);
					}
				}
			}
			System.out.println(max);
		}
	}
}