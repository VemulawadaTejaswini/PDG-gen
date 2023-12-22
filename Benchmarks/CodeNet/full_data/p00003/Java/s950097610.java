class Main{
    public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int i = 0;i<num;i++){
			int[] array = new int[3];

			for (int j = 0; j < 3; j++) {
				array[i] = sc.nextInt();

			}

			Arrays.sort(array);

			if (array[2] * array[2] == array[1] * array[1] + array[0] * array[0]) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}		
	}
}