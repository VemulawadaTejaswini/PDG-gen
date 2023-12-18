import java.util.*;
public class double_helix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		if (b.charAt(0)=='A'){
			System.out.println('T');
		}else if (b.charAt(0)=='C'){
			System.out.println('G');
		}else if (b.charAt(0)=='G'){
			System.out.println('C');
		}else{
			System.out.println('A');
		}
	}

}
