public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		char[] data = sc.nextLine().toCharArray();

//		System.out.println(data);
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);
//		System.out.println(data[3]);
//		System.out.println(data[4]);

		for (int i=0; i < data.length; i++) {
			if ( Character.isUpperCase(data[i]) ) {
				data[i] = Character.toLowerCase(data[i]);
			} else if ( Character.isLowerCase(data[i]) ) {
				data[i] = Character.toUpperCase(data[i]);
			}
		}

		System.out.println(data);
	}

}