import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (true) {
				Double d = Double.parseDouble(br.readLine());
				if (Math.signum(d)<0) break;
				Integer i = d.intValue();
				d -= i;
				int face[] = new int[8];
				int shade[] = new int[4];

				for (int j=0;j<8;j++) {
					if (i%2==0) face[7-j] = 0;
					else face[7-j] = 1;
					i >>= 1;
				}
				if (i>0) {
					System.out.println("NA");
					continue;
				}

				Double dd;
				for (int j=0;j<4;j++) {
					dd = d*2;
					if (dd<1.0) shade[j] = 0;
					else shade[j] = 1;
					d = dd-dd.intValue();
				}
				if (d>0.0) {
					System.out.println("NA");
					continue;
				}

				for (int j=0;j<8;j++) {
					System.out.print(face[j]);
				}
				System.out.print(".");
				for (int j=0;j<4;j++) {
					System.out.print(shade[j]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}