class Main{

	public static void main(String[] a){
		int j = 1;
		int i = 1;

		for(int count = 1; count < 10; count++){
			System.out.println(i +"×" +  j + "=" + i * j);
			j++;
			if( j == 10){
				i++;
				j = 1;
				count = 0;
				if(i == 10){
					count = 10;
				}
			}
		}
	}
}