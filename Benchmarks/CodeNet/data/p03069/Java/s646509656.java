import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		int bcount = 0, wcount = 0;
		String s;
		n = sc.nextInt();
		s = sc.next();
		char[] sArray = s.toCharArray();

		for(i = 0; i < n - 1; i++) {
			if(sArray[i] == '#') {
				if(sArray[i + 1] == '.') {
				    bcount++;
				    sArray[i + 1] = '#';
				}
			}else if(sArray[i] == '.') {
				if(sArray[i + 1] == '#') {
				    wcount++;
				    sArray[i + 1] = '.';
				}
			}
		}
		if(wcount > bcount){
		    System.out.println(wcount);
		}else{
		    System.out.println(bcount);
		}
		sc.close();
	}
}