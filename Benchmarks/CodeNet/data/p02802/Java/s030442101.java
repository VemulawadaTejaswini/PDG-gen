import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> ansstack = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] p=new int[m];
		String[] s=new String[m];
		
		long ans_num=0;
		long pena_num=0;
		
		for(int i=0;i<m;i++) {
			p[i] = sc.nextInt();
			s[i] = sc.next();
			
			if(s[i].equals("AC")) {
				if(!ansstack.contains(p[i])) {
					ansstack.add(p[i]);
					ans_num+=1;
				}
			}
			else if(s[i].equals("WA")) {
				if(!ansstack.contains(p[i])) {
					pena_num+=1;
				}
			}
		}
		System.out.println(ans_num+" "+pena_num);
	}
}