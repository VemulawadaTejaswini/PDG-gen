import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] dise = new int[7];
		
		for(int i = 1; i < 7; i++){
			dise[i] = scan.nextInt();
		}

		String houi = scan.next();
		int su = houi.length();
		char[] muki = new char[su];
		for(int j = 0; j < su; j++){
			muki[j] = houi.charAt(j);
		}

		for(int m = 0; m < su; m++){
			if(muki[m] == 'E'){
				int  e  = dise[1]; dise[1] = dise[4]; dise[4] = dise[6];
				dise[6] = dise[3]; dise[3] = e;
			}
			if(muki[m] == 'S'){
				int  s  = dise[1]; dise[1] = dise[5]; dise[5] = dise[6];
				dise[6] = dise[2]; dise[2] = s;
			}
			if(muki[m] == 'W'){
				int  w  = dise[1]; dise[1] = dise[3]; dise[3] = dise[6];
				dise[6] = dise[4]; dise[4] = w;
			}
			if(muki[m] == 'N'){
				int  n  = dise[1]; dise[1] = dise[2]; dise[2] = dise[6];
				dise[6] = dise[5]; dise[5] = n;
			}
		}
		System.out.println(dise[1]);
	}
}

