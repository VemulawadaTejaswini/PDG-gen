import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		String data[] = new String[n];
		String data1[] = new String[n];
		String data2[] = new String[n];
		
		for ( int i = 0; i < n; i++) {
			data1[i] = scan.next();
			data2[i] = data1[i];
			data[i] = data1[i];
		}
		scan.close();
		BubbleSort(data1, data ,n);
		SelectionSort(data2, data, n);
		
	}
	
	public static void BubbleSort(String str[], String array[], int n) {
		
		int min = 0, a;
		String c;
		boolean flg;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				min = Integer.parseInt(str[j].substring(1));
				a = Integer.parseInt(str[j - 1].substring(1));
				if (min < a) {
					c = str[j - 1];
					str[j - 1] = str[j];
					str[j] = c;
				}
			}
				
		}
		
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.println(str[i]);
				flg = isStable(str, array, n);
				if ( flg == true) {
					System.out.println("Stable");
				} else {
					System.out.println("No stable");
				}
			} else {
				System.out.print(str[i] + " ");
			}
		}
		
	}
	
	public static void SelectionSort(String str1[], String array1[], int n) {
		int min;
		int a, b;
		String c;
		boolean flg;
		
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for ( int j = i + 1; j < n; j++) {
				a = Integer.parseInt(str1[min].substring(1));
				b = Integer.parseInt(str1[j].substring(1));
				if (a > b) min = j;
			}
			if ( i != min) {
				c = str1[i];
				str1[i] = str1[min];
				str1[min] = c;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.println(str1[i]);
				flg = isStable(str1, array1, n);
				if ( flg == true) {
					System.out.println("Stable");
				} else {
					System.out.println("No stable");
				}
			} else {
				System.out.print(str1[i] + " ");
			}
		}
	}
	
	public static boolean isStable(String str[], String array[], int n) {
		int x, y;
		
		for ( int i = 0; i < n - 1; i++ ) {
			x = Integer.parseInt(str[i].substring(1));
			for ( int j = i + 1; j < n - 1; j++) {
				y = Integer.parseInt(str[j].substring(1));
				if (x == y) {
					for ( int a = 0; a < n ; a++) {
						if ( str[i] == array[a]) {
							for (int b = 0; b < n ; b++) {
								if (str[j] == array[b]) {
									if ( a > b ) {
										return false;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return true;
	}
	
}

