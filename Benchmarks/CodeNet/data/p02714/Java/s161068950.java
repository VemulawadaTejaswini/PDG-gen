import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int rc = 0;
		int gc = 0;
		int bc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				rc++;
			} else if(s.charAt(i) == 'G'){
				gc++;
			} else {
				bc++;
			}
		}
		long result = rc*gc*bc;
		for(int i=0; i<n; i++){
			for(int k=i+1; k<n; k++){
				if((i+k)%2 == 0){
					int j = (i+k)/2;
					char is = s.charAt(i);
					char ks = s.charAt(k);
					char js = s.charAt(j);
					if(i<j && j<k && is != ks && ks != js && js != is){
						result--;
					}
				}
			}
		}
		System.out.println(result);
	}
}
