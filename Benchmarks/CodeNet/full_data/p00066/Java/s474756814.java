import java.io.*;

class Researcher {
	int mat[][] = new int[3][3];
	String index = "oxs";

	Researcher(String s) {
		for (int i=0;i<9;i++) {
			mat[i/3][i%3] = index.indexOf(s.charAt(i)); 
		}
	}

	char Research() {
		if (mat[1][1]<=1) {
			if (mat[0][0]==mat[1][1]&&mat[1][1]==mat[2][2]) return index.charAt(mat[0][0]);
			else if (mat[2][0]==mat[1][1]&&mat[1][1]==mat[0][2]) return index.charAt(mat[2][0]);
		}

		for (int i=0;i<3;i++) {
			if (mat[i][0]<=1) {
				if (mat[i][0]==mat[i][1]&&mat[i][1]==mat[i][2]) return index.charAt(mat[i][0]);
			} else if (mat[0][i]<=1) {
				if (mat[0][i]==mat[1][i]&&mat[1][i]==mat[2][i]) return index.charAt(mat[0][i]);
			}
		}
		return 'd';
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				System.out.println(new Researcher(buf).Research());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}