//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	 static List <String> z;
	public static void main(String[] args) {
		z = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder P_sb = new StringBuilder();
        StringBuilder Q_sb = new StringBuilder();
        for (int n = 0; n < N; n++) {
            P_sb.append(sc.nextInt());
        }
        for (int n = 0; n < N; n++) {
            Q_sb.append(sc.nextInt());
        }
       // System.out.println(P_sb);
        StringBuilder sb = new StringBuilder();
        for(int n=0;n<N;n++) {
        	sb.append(n+1);
        }
        //System.out.println(sb);
        permutation(sb.toString(),"");
        
        int a = 0; int b = 0;
        for (int i = 0; i < z.size(); i++) {
//            System.out.println(z.get(i));
            if ( P_sb.toString().equals(z.get(i)) ) a = i;
            if ( Q_sb.toString().equals(z.get(i)) ) b = i;
        }
        System.out.println(Math.abs(b - a));
	}
	public static void permutation(String q,String ans) {
		
		if(q.length()<=1) {
			z.add(ans+q);
		}else {
			for(int i=0;i<q.length();i++) {
				permutation(q.substring(0,i)+q.substring(i+1),ans+q.charAt(i));
			}
		}
	}
}