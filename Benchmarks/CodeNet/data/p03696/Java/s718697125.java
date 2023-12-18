import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String s2 = "";
		String s3 = "";
		String s4 = "";
		int tojiLastIndex = s.lastIndexOf(")");
		int kakkoCnt = 0;
		int kakkoTojiCnt = 0;

		if (tojiLastIndex >= 0){
			s2 = s.substring(0, tojiLastIndex +1);
			for (int i=0; i <s2.length(); i++){
				if (s.charAt(i) == '('){
					kakkoCnt++;
				} else {
					kakkoTojiCnt++;
				}
			}
			StringBuffer sb = new StringBuffer();
			if (kakkoCnt < kakkoTojiCnt){
				for(int i=0; i < (kakkoTojiCnt - kakkoCnt); i++){
					sb.append("(");
				}
			}
			sb.append(s);
			s3 = sb.toString();
		} else {
			s3 = s;
		}

		kakkoCnt = 0;
		kakkoTojiCnt = 0;
		for (int i=0; i< s3.length(); i++){
			if (s3.charAt(i) == '('){
				kakkoCnt++;
			} else {
				kakkoTojiCnt++;
			}
		}
		if (kakkoCnt > kakkoTojiCnt){
			StringBuffer sb2 = new StringBuffer();
			sb2.append(s3);
			for (int i=0; i < (kakkoCnt - kakkoTojiCnt); i++){
				sb2.append(")");
			}
			s4 = sb2.toString();
		} else {
			s4 = s3;
		}

		System.out.println(s4);
	}

}
