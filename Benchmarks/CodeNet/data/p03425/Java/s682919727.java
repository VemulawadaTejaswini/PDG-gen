import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] name = new int[5];
		long count = 0;
		for (int i=0; i<N; i++){
			char ini = sc.next().charAt(0);
			if (ini=='M'){
				name[0]++;				
			}else if (ini=='A'){
				name[1]++;				
			}else if (ini=='R'){
				name[2]++;				
			}else if (ini=='C'){
				name[3]++;	
			}else if (ini=='H'){
				name[4]++;
			}
		}
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				for (int k = j + 1; k < name.length; k++) {
					count += name[i] * name[j] * name[k];
				}
			}
		}
		System.out.println(count);
		
	}

}