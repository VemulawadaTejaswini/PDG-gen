public static void main(String[] args) {
	for (int i = 1; i <= 9; i = i++)
		for (int j = 1; j <= 9; j = j++)
			System.out.println(i + "x" + j + "=" + (i * j));
	}