import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

		  public static void main(String[] args) {
			     java.util.Scanner scanner = new java.util.Scanner(System.in);
                              int count = scanner.nextInt();
                             int[] t = new int[count];
                             int[] v = new int[count];
                             for (int i = 0; i < count; i++ ) {
                                  t[i] = scanner.nextInt();
                             }
                             for (int i = 0; i < count; i++ ) {
                                  v[i] = scanner.nextInt();
                             }
				  double kyori = 0;
				  int previousV = 0;
				  for (int i = 0; i < count; i++) {
					  int kasokut = Math.min(Math.abs(v[i] - previousV), t[i]);
					  int kasoku = (v[i] > previousV) ? 1 : -1;
					  kyori = kyori + 
							  (( kasokut * kasokut * kasoku) / 2) + 
								previousV * kasokut
							  	+ ((t[i] - kasokut) * v[i]);
					  previousV = previousV + (kasokut * kasoku);
				  }
				  System.out.println(kyori);
		  }
}