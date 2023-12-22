public class Main{
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0; i < 10; i++){
				a[i] = Integer.parseInt(args[i]);
			}

		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(a[j] < a[j+1]){
					int p = a[j];
					a[j] = a[j+1];
					a[j+1] = p;
				}
			}
		}

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}