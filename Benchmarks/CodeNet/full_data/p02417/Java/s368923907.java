import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (scan.hasNextLine()) {
			String st = scan.nextLine();
			sb.append(st);
		}
		String st = sb.toString();

		sc(st,'a');
		sc(st,'b');
		sc(st,'c');
		sc(st,'d');
		sc(st,'e');
		sc(st,'f');
		sc(st,'g');
		sc(st,'h');
		sc(st,'i');
		sc(st,'j');
		sc(st,'k');
		sc(st,'l');
		sc(st,'m');
		sc(st,'n');
		sc(st,'o');
		sc(st,'p');
		sc(st,'q');
		sc(st,'r');
		sc(st,'s');
		sc(st,'t');
		sc(st,'u');
		sc(st,'v');
		sc(st,'w');
		sc(st,'x');
		sc(st,'y');
		sc(st,'z');
	}
	static void sc(String st,char cha) {
		int count = 0;
		for ( int i = 0; i < st.length(); i++) {
			if ( cha == st.charAt(i) ||
					Character.toUpperCase(cha) == st.charAt(i) ) {count++;}
		}
		System.out.println(cha + " : " + count);
	}

}