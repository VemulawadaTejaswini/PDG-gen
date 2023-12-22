import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String buf = br.readLine();
			boolean First = true;
			for (int i=0;i<buf.length();i++) {
				String str = "";
				while (NotStop(buf.charAt(i))) {
					str = str+buf.charAt(i);
					i++;
				}
				if (str.length()>=3&&str.length()<=6) {
					if (First) {
						System.out.print(str);
						First = false;
					}
					else System.out.print(" "+str);
				}
			}
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean NotStop(char a) {
		if (a=='.'||a==' '||a==',') return false;
		else return true;
	}
}