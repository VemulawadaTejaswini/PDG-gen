import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			
			int suma = 0;
			int sumb = 0;
			
			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				suma += a[i];
			}
			for (int i=0; i<n; i++) {
				b[i] = sc.nextInt();
				sumb += b[i];
			}
			
			if (suma < sumb) {
				System.out.println(-1);
				return;
			}
			
			int count = 0;
			int husoku = 0;
			int kajo_count = 0;
			List<Integer> kajo_list = new ArrayList<Integer>();

			for (int i=0; i<n; i++) {
				if (a[i] < b[i]) {
					count++;
					husoku += b[i] - a[i];
				} else if (a[i] > b[i]) {
					kajo_count++;
					kajo_list.add(a[i] - b[i]);
					
				}
			}
			
			if (count == 0) {
				System.out.println(count);
				return;
			}
			
			Collections.sort(kajo_list, Collections.reverseOrder());
			int kajo_sum = 0;
			for(int i=0;i<kajo_list.size();i++){
				kajo_sum += kajo_list.get(i);
				
				if (husoku <= kajo_sum) {
					break;
				}
				count++;
			}
			
			System.out.println(count);

		}
	}
}