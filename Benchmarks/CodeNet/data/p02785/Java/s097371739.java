import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] monsters =new Integer[n];
		for (int i=0;i<n;i++){
			monsters[i]=sc.nextInt();
		}
		 Arrays.sort(monsters, Collections.reverseOrder());
//		 for (int l=0;l<n;l++) {
//			 System.out.println("HP:"+monsters[l]);
//		 }
		 int hp =0;
		 for (int j=k;j<n;j++) {
			 hp += monsters[j];
		 }
		 int attackCount = 0;
		 if (hp>=0) {
			 attackCount += hp;
		 }
		 if (n<=k) {
			 System.out.println(0);
		 }else {
			 System.out.println(attackCount);
		 }


		//------------------------------------------------------------
	}
}