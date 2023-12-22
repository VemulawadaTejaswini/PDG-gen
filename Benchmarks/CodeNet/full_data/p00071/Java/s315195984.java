import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			String str[] = new String[8];
			int field[][] = new int[8][8];
			int n = Integer.parseInt(br.readLine());
			br.readLine();
			for (int i=0;i<n;i++) {
				for (int j=0;j<8;j++) {
					str[j] = br.readLine();
					for (int k=0;k<8;k++) {
						field[j][k] = Character.getNumericValue(str[j].charAt(k));
					}
				}
				int x = Integer.parseInt(br.readLine())-1;
				int y = Integer.parseInt(br.readLine())-1;
				if (field[y][x]==1) Chein(field,x,y);
				System.out.println("Data "+(i+1)+":");
				for (int j=0;j<8;j++) {
					for (int k=0;k<8;k++) System.out.print(field[j][k]);
					System.out.println("");
				}
				br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Chein(int[][] m,int x,int y) {
		m[y][x] = 0;
		for (int i=1;i<=3;i++) {
			if (x-i>=0&&m[y][x-i]==1) Chein(m,x-i,y);
			if (x+i<=7&&m[y][x+i]==1) Chein(m,x+i,y);
			if (y-i>=0&&m[y-i][x]==1) Chein(m,x,y-i);
			if (y+i<=7&&m[y+i][x]==1) Chein(m,x,y+i);
		}
	}
}