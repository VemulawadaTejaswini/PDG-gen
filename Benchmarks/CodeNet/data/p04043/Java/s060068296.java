import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int haikuarray[] = new int[3];
		for(int i = 0; haikuarray.length > i; i++) {
			haikuarray[i] = sc.nextInt();
		}
		sc.close();
		boolean j = retHaiku(haikuarray);
		if(j == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	public static boolean retHaiku(int harray[]) {
		int sevencnt = 0;
		int fivecnt = 0;
		for(int i = 0; harray.length > i; i++) {
			if(harray[i] == 7 && sevencnt == 0) {
				sevencnt++;
			}else if(harray[i] == 5 && fivecnt < 2) {
				fivecnt++;
			}else {
				return false;
			}
		}
		return true;
	}

}