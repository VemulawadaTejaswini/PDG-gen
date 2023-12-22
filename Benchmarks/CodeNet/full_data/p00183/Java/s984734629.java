import java.util.Scanner;

public class Main {
	static char[][] f;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			f = new char[3][3];
			for(int i=0;i<3;i++){
				char[] input = stdIn.nextLine().toCharArray();
				if(input[0]=='0') return;
				f[i] = new char[3];
				for(int j=0;j<3;j++){
					f[i][j] = input[j];
				}
			}
			if(judge()=='b') System.out.println("b");
			else if(judge()=='w') System.out.println("w");
			else System.out.println("NA");
		}
	}

	private static char judge() {
		if(f[0][0]==f[0][1]&&f[0][0]==f[0][2]) return f[0][0];
		if(f[1][0]==f[1][1]&&f[1][0]==f[1][2]) return f[1][0];
		if(f[2][0]==f[2][1]&&f[2][0]==f[2][2]) return f[2][0];
		if(f[0][0]==f[1][0]&&f[0][0]==f[2][0]) return f[0][0];
		if(f[0][1]==f[1][1]&&f[0][1]==f[2][1]) return f[0][1];
		if(f[0][2]==f[1][2]&&f[0][2]==f[2][2]) return f[0][2];
		if(f[0][0]==f[1][1]&&f[0][0]==f[2][2]) return f[0][0];
		if(f[0][2]==f[1][1]&&f[0][2]==f[2][0]) return f[0][2];
		return 'e';
	}
}