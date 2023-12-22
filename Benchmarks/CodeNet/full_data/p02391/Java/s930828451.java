class Main{
	public static void main(String[] a){
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		System.out.print("a ");
		if (num1 < num2) {
			System.out.print("<");
		} else if (num1 > num2) {
			System.out.print(">");
		} else {
			System.out.print("==");
		}
		System.out.println(" b");
	}
}