class Main{
	public static void main(String[] a){
		int last = 10;
		for (int i = 1; i < last; i++) {
			if (i <= 2 || (last-i) <= 2) {
				System.out.println(i + "x" + i + "=" + (i * i));
			} else if (i<=3 || (last-i)<=3){
				System.out.println(".");
			}
		}
	}
}