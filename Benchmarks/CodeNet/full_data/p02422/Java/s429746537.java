import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int q = sc.nextInt();
		String dammy = sc.nextLine();

//		System.out.println(dammy);
//
//		System.out.println(str);

		for (int i=0; i<q; i++) {

			String[] line = sc.nextLine().split(" ");

//			System.out.print(line[0]);
//			System.out.print(line[1]);
//			System.out.println(line[2]);

			int a = Integer.parseInt(line[1]);
			int b = Integer.parseInt(line[2]);

			switch ( line[0] ) {
			case "print":
				System.out.println(str.substring(a, b+1));
				break;

			case "reverse":
				String str1 = str.substring(0, a);
				String str2 = str.substring(a, b+1);
				String str3 = str.substring(b+1);

				char[] str2array = str2.toCharArray();

//				System.out.println(str1);
//				System.out.println(str2);
//				System.out.println(str3);

				str = str1;

//				System.out.println(str);

				for (int j = str2array.length - 1; j >= 0 ; j--) {
					str += String.valueOf( str2array[j] );

//					System.out.println(str);

				}
				str += str3;

//				System.out.println(str);

				break;

			case "replace":
				String p = line[3];
				String str11 = str.substring(0, a);
				String str22 = str.substring(b+1);

				str = str11 + p + str22;

//				System.out.println(str);

				break;
			}

		}
	}

}