import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//階層数
		long fin;
		
		fin =  fin(num);

		System.out.println(fin);
		
		scanner.close();
	}
	
	public static long fin(int num) {
		long Fin0 = 1,Fin1 = 1,Fin = 0;
		
		if( num == 0 ) return 0;
		if( num == 1 ) return 1;
		
		for(int i = 1; i < num; i ++) {
			Fin = Fin0 + Fin1;
			Fin0 = Fin1;
			Fin1 = Fin;
		}
		
		return Fin; 
	}
}

/* 実行時間計測用

		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms:計測時間");
*/import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//階層数
		long fin;
		
		fin =  fin(num);

		System.out.println(fin);
		
		scanner.close();
	}
	
	public static long fin(int num) {
		long Fin0 = 1,Fin1 = 1,Fin = 0;
		
		if( num == 0 ) return 0;
		if( num == 1 ) return 1;
		
		for(int i = 1; i < num; i ++) {
			Fin = Fin0 + Fin1;
			Fin0 = Fin1;
			Fin1 = Fin;
		}
		
		return Fin; 
	}
}

/* 実行時間計測用

		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms:計測時間");
*/
