class Main{
    public static void main(String[] a){
		int num1[] = new int[200];
		int num2[] = new int[200];
		int i = 0, j = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			num1[i] = Integer.parseInt(scanner.next());
			num2[i] = Integer.parseInt(scanner.next());
			i++;
		}
		
		for(j = 0; j < i; j++) {
			System.out.println(num1[j] + num2[j]);
		}
		scanner.close();

    }
}
