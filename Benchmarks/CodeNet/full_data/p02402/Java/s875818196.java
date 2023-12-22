import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

	String   input1 = br.readLine();
	String[] input2 = br.readLine().split(" ");

	int size = Integer.parseInt(input1);
	int[] a = new int[size];

	for(int i = 0; i < size; i++) {
		a[i] = Integer.parseInt(input2[i]);
	}

	long min = a[0], MAX = a[0], sum = 0;

	for(int j = 0; j < size; j++) {
		if(a[j] >= MAX) MAX = a[j];
		if(a[j] <= min) min = a[j];
		sum += a[j];
	}
	System.out.println(min + " " + MAX + " " + sum);
	}
}