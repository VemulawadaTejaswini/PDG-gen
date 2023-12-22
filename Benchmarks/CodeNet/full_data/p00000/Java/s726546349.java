class Main{
    public static void main(String[] a){
			int[] num = {1,2,3,4,5,6,7,8,9};
			for (int x: num){
				for (int y: num){
					int z = x * y;
					System.out.println(String.valueOf(x)+'x'+String.valueOf(y)+'='+String.valueOf(z));
				}
			}
    }
}