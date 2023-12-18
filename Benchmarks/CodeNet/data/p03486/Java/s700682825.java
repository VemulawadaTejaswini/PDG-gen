import java.util.*;
public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String[] S = new String[s.length()];
		String[] T = new String[t.length()];
		for(int i=0; i<s.length(); i++) {
			S[i] = s.substring(i,i+1);
		}
		s="";
		Arrays.sort(S);
		for(int i=0;i<s.length();i++){
            s+=S[i];
        }
		for(int i=0; i<t.length();i++) {
			T[i]=t.substring(i,i-1);
		}
		t="";
		Arrays.sort(T);
		for(int i=0;i<t.length();i++){
            t+=T[t.length()-i-1];
        }
		
		if(s.compareTo(t)<0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
