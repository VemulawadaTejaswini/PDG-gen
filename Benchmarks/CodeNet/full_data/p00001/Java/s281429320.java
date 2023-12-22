public class Main {
	public static void main(String[] a) throws NumberFormatException, IOException{

		int arr[] = new int [10];
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		for( int i=1; i<10; i++){

		 arr[i] = Integer.parseInt(read.readLine());

		}

		 Arrays.sort(arr);

		 for(int i = 9; i>6; i--){

			 System.out.println(arr[i]);

	}

}
}