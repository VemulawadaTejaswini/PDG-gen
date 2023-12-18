import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		boolean ok = true;
		for(int i = 0;i < n; ++i){
			if((i&1) == 0){
				if((s.charAt(i) != 'R') && (s.charAt(i) != 'U') && (s.charAt(i) != 'D')){
					ok = false;
					// System.out.println(i);
					break;
				}
			}else{
				if((s.charAt(i) != 'L') && (s.charAt(i) != 'U') && (s.charAt(i) != 'D')){
					ok = false;
					// System.out.println(i);
					break;
				}
			}
		}
		if(ok){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}	
}