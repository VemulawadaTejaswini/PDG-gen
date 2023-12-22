import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] intArray = new int[n];
		for(int i = 0; i < n; i++) {
			intArray[i] = -2;
		}

		int head = 0;
		int tail = 0;

		for(int i = 0; i < n; i++) {
			String order = sc.next();
			int key = 0;

			switch(order) {
			case "insert":
				key = sc.nextInt();
				intArray[tail] = key;
				tail++;
				break;
			case "delete":
				key = sc.nextInt();
				for(int j = tail; j >= 0; j--) {
					if(intArray[j] == key) {
						intArray[j] = -1;
						break;
					};
				}
				break;
			case "deleteFirst":
				for(int j = tail; j >= 0; j--) {
					if(intArray[j] >= 0) {
						intArray[j] = -1;
						break;
					}
				}
				break;
			case "deleteLast":
				for(int j = head; j <= tail; j++) {
					if(intArray[j] >= 0) {
						intArray[j] = -1;
						head = j + 1;
						break;
					}
				}
				break;
			}
		}

		int cnt = 0;
		for(int i = tail; i >= 0 + 1; i--) {
			if(intArray[i] >= 0) {

				if(cnt == 0) {
					System.out.print(intArray[i]);
				} else {
					System.out.print(" " + intArray[i]);
				}
				cnt++;
			}
		}
		System.out.println("");
	}

}
