import java.util.Arrays;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		String c[][]=new String[n][51];
		for(int i=0;i<n;i++) {
			String s=scanner.next();
			for(int j=0;j<51;j++) {
				if(j<s.length()) {
					c[i][j]=s.substring(j, j+1);
				}else {
					c[i][j]="Z";
				}
			}
			Arrays.sort(c[i], String.CASE_INSENSITIVE_ORDER);
		}
		String[] tmp=c[0];
		for(int i=1;i<n;i++) {
			tmp=calc(tmp,c[i]);
		}
		for(int i=0;i<51;i++) {
			if(Character.isLowerCase(tmp[i].charAt(0)))
				System.out.print(tmp[i]);
		}
		System.out.println("");
	}

	private static String[] calc(String[] tmp, String[] c) {
		String[] res=new String[51];
		Arrays.fill(res, "Z");
		int a=0;
		for(int i=0;i<51;i++) {
			String c1=tmp[i];
			for(int j=a;j<51;j++) {
				String c2=c[j];
				if(c1.equals(c2)) {
					res[i]=c1;
					a=j+1;
					break;
				}
			}
		}
		Arrays.sort(res, String.CASE_INSENSITIVE_ORDER);
		return res;
	}
}