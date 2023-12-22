import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			int count = 0;
			while((s = reader.readLine()) != null) {
				int n = Integer.parseInt(s);
				for(int i = 0;i < 10;i++) {
					for(int j = 0;j < 10;j++) {
						for(int k = 0;k < 10;k++) {
							for(int l = 0;l < 10;l++) {
								if(i + j + k + l == n)
									count++;
							}
						}
					}
				}
				System.out.println(count);
				count = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}