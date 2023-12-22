import java.io.*;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				StringBuffer a = new StringBuffer(br.readLine());
				StringBuffer b = new StringBuffer(br.readLine());
				a.reverse();
				b.reverse();

				if (a.length()<=80&&b.length()<=80) {
					StringBuffer stb = new StringBuffer();
					for (int j=a.length();j<81;j++) a.append(0);
					for (int j=b.length();j<81;j++) b.append(0);

					int c = 0;
					for (int j=0;j<81;j++) {
						int s = partical_s(a.charAt(j),b.charAt(j))+c;
						stb.append(s%10);
						c = s/10;
					}
					if (stb.charAt(0)=='0') {
						int j = 0;
						stb.reverse();
						while (stb.charAt(j)=='0'&&j<stb.length()-1) j++;
						StringBuffer newsb = new StringBuffer();
						for (int d=j;d<stb.length();d++) newsb.append(stb.charAt(d));
						System.out.println(newsb);
					} else System.out.println("overflow");
				} else {
					System.out.println("overflow");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int partical_s(char a,char b) {
		return Integer.parseInt(""+a)+Integer.parseInt(""+b);
	}
}