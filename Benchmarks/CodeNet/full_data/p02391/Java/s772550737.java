import java.util.Scanner;

class	Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String nyuryoku = scanner.nextLine();
		String[] array = nyuryoku.split(" ",0);
		int a = Integer.parseInt(array[0]) , b = Integer.parseInt(array[1]) ;
		hikaku(a,b);
		scanner.close();
	}

	public static void hikaku(int a , int b){
			if(a > b ){System.out.println("a > b");}
			else if(a < b){System.out.println("a < b");}
			else if(a == b){System.out.println("a == b");}
	
		return ;
	}
}