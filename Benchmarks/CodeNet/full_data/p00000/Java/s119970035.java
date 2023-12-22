public class Main {
	public static void main(String[] a){
		int temp;
		for(int i = 1; i < 10; i++){
			for(int k = 1; k < 10; k ++){
				temp = i * k;
				System.out.printf("%d x %d = %d\n", i, k, temp);
			}
		}
	}

}