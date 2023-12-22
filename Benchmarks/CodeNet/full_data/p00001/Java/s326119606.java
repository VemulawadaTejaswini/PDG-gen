class Main{
	private static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = a.length-1;j > i;j--){
				if(a[j] > a[j-1]){
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
	}
	private static void print_hill(int[] a){
		for(int i = 0;i<3;i++){
			System.out.println(a[i]);
		}
	}
		public static void main(String args[]){
		int hills[] = {324,433,345,1333,2334,5789,3121,32,155,9999};
		sort(hills);
		print_hill(hills);
	}
}