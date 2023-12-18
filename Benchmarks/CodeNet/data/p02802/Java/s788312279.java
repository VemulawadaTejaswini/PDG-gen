import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Map<Integer,String> p = new HashMap<>();
		int ac=0;
		int wa=0;
		
		for(int i=0;i<m;i++) {
		
			int k = sc.nextInt();
			String t = sc.next();
			
			//初めての回答
			if(!(p.containsKey(k))) {
				if(t.equals("WA")) {
					wa++;
				}else {
					ac++;
				}
				p.put(k,t);
			}else {//二度目以降の回答の場合
				if(p.get(k).equals("WA")&&t.equals("WA")) {
					wa++;
				}
				if(p.get(k).equals("WA")&&t.equals("AC")) {
					ac++;
					p.put(k, t);
				}
				
			}
			
		}
		
		System.out.println(ac+" "+wa);
		
		sc.close();
	}
}
