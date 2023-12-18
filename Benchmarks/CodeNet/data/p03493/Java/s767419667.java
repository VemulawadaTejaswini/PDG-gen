public class Main2 {
	public static void main(String[] args){
	int[] numbers = new int[3];
	numbers[0] = 1;
	numbers[1] = 0;
	numbers[2] = 0;
	
	int count = 0;
	
	for(int i = 0; i <= 2 ; i++ ) {
	if(numbers[i] == 1) {
		count++;
	  }
	 }
	System.out.println(count);
	}
}
