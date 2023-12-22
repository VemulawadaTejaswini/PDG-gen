class Main{
	public static void main(String[] a){
		int i = 1;
		int j = 1;
		while(i<=9){
			while(j<=9){
				System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			i++;
		}
	}
}