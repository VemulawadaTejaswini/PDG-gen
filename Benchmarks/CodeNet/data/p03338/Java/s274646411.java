import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dmp = Math.max(a+b, a-b);
		System.out.println(Math.max(dmp,a-b));
		*/
		//B
		int n = sc.nextInt();
		String s = sc.next();
		int[]ansdmp = new int[100];
		for(int i = 0 ; i < n ; i++){
			ansdmp[i]= 0;
			String s1 = s.substring(0,i);
			String s2 = s.substring(i,n);
			String s1sub = "";
			for(int j = 0 ; j < s1.length(); j++){
				if(s1sub.indexOf(s1.charAt(j)) == -1)
					s1sub+=s1.charAt(j);
			}
			//System.out.println(s1sub);
			String usedstr = "";
			for(int k = 0 ; k < s2.length(); k++){
				if (usedstr.indexOf(s2.charAt(k))== -1) {
					if (s1sub.indexOf(s2.charAt(k)) != -1) {
						ansdmp[i]++;
						usedstr += s2.charAt(k);
					}
				}
			}
			//System.out.println(ansdmp[i]);
		}
		int ans = 0;
		for(int x : ansdmp){
			ans = Math.max(ans,x);
		}
		System.out.println(ans);

	}
}
