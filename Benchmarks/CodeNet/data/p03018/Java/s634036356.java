import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();

		// 「ABC → BCA」の置換はAとBCの交換とみなせる
		//  なのでAかBCの連続だけを見ればいいはず
		//Matcher m = Pattern.compile("A(A|BC)*BC").matcher(base);

		int cntA = 0;
		int answer = 0;

		//while ( m.find() ) {
		for ( String s : base.split( "(?!(A(A|BC)*BC))" ) ) {		
			char[] targ = s.toCharArray();

			// BCの交換可能回数＝BCより左にあるAの個数
			for ( int i = 0; i < targ.length; i++ ) {
				if ( targ[i] == 'A' ) cntA++;
				else if ( targ[i] == 'B' ) answer += cntA;
			}
			cntA = 0;
		}

		System.out.println(answer);
		in.close();
	}
}