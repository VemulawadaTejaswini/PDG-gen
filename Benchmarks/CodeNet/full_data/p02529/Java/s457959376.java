import java.util.*;

/* No.10030 WA
üÍ³êé®ÌãÀªs¾ÈÌÅAint^ÌÅålÌvfðÂe[u
int[] table = new int[Integer.MAX_VALUE]ðé¾µA
»êÉAõlðYÉµÄCNgA
³çÉo»lðYÉµÄcountÉÁZ(õlÅÈ¯êÎ0ªÁZ)
Ìè@ðÝ½ªAint[Integer.MAX_VALUE]±êÍª«èÈ¢ÍlBfO
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[100], t = new int[100];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			s[i] = sc.nextInt();
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ )
			t[i] = sc.nextInt();
		int count = 0;
		for ( int i = 0; i < m; i++ ){
			for ( int j = 0; j < n; j++ ){
				if ( t[i] == s[j] ) {
count++; break;}}}
		System.out.println(count);
	}
}