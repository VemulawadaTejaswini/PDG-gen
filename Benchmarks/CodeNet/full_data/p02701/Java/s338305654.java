import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] array = new String[n];
		int size = 0;
		for(int i = 0;i < n;i++) {
			String temp = sc.next();

			array[i] = temp;

			boolean flag = true;

			for(int x = 0;x < size;x++ ) {
				if(array[x].equals(temp)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				array[size] = temp;
				size++;
			}

		}

		System.out.println(size);
	}
}