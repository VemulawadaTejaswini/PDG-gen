import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				for (int i=0;i<buf.length();i++) {
					if (buf.charAt(i)!='@') System.out.print(buf.charAt(i));
					else {
						i++;
						int k = Character.getNumericValue(buf.charAt(i++));
						for (int j=0;j<k;j++) {
							System.out.print(buf.charAt(i));
						}
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}