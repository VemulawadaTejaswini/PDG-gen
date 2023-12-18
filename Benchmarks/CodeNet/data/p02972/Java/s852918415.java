
import java.util.Scanner;

public class Main {
	static int intN =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] a1 = sc.nextLine().split(" ");

		intN = Integer.parseInt(n);

		String sosu = sosuRetsuSakusei();

		String result2="";
		int cnt=0; // 2行目に何個1があるか
		for (int i = 0;i < intN; i++) {
			if ("1".equals(a1[i])) {
				cnt++;
			}
		}
		int result1=cnt;
		if (cnt==0) {
			System.out.println("0");
		} else if (cnt%2==0) {
			System.out.println("-1");
		} else {
			for (int i = 0;i < intN; i++) {
				if (!sosu.contains("," +String.valueOf(i+1))) {
					continue;
				}
				String temp="";
				if (cnt!=0) {
					temp=String.valueOf(i+1);
					cnt--;
				}

				if (!"".equals(temp)) {
					if ("".equals(result2)) {
						result2=temp;
					} else {
						result2=result2 + " " + temp;
					}
				}

			}
			System.out.println(result1);
			System.out.println(result2);
		}

	}


	private static String sosuRetsuSakusei() {
		String result=",1";

		for (int j=3;j < intN+1;j=j+2) {
			if (intN%j==0) {
				result=result + "," + j;
			}
		}

		//System.out.println(result);

		return result;
	}

}