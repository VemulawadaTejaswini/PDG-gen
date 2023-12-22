import java.util.Scanner;

public class Main {
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long num_max = 0;
		long num_min = 0;
		int size = 0;
		long count = 0;
		String ans = "";
		String[] list = {"a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z"};

		for(int i = 1;i <= 10;i++) {
			if(n <= num_max) {
				break;
			}
			num_max += (long)Math.pow(26 , i);
			size += 1;
		}

		if(size == 1) {
			num_min = (long)Math.pow(26 , size - 1);
		}else {
			num_min = (long)Math.pow(26 , size - 1) + 1;
		}

		int[] num_list = new int[size];

		count = n - num_min;

		for(int i = 0;i < count;i++) {
			num_list[size - 1] += 1;

			for(int j = size - 1;j > 0;j--) {
				if(num_list[j] >= 26) {
					num_list[j - 1] += 1;
					num_list[j] = 0;
				}
			}
		}

		for(int i = 0;i < size;i++) {
			if(i == 0 || i == size - 1) {
				ans += list[num_list[i]];
			}else {
				ans += list[num_list[i] - 1];
			}
		}

		System.out.println(ans);
	}
}
