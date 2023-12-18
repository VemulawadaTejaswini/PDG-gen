import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String stringO = sc.next();
		String[] arrayO = stringO.split("");
		String stringE = sc.next();
		String[] arrayE = stringE.split("");
		String[] arrayZ = new String[stringO.length() + stringE.length()];
		for (int i=0;i<arrayO.length;i++) {
			arrayZ[i*2] = arrayO[i];
		}
		for (int i=0;i<arrayE.length;i++) {
			arrayZ[i*2+1] = arrayE[i];
		}
		String StringOE = String.join("",arrayZ);
		System.out.println(StringOE);
	}
}