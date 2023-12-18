public class Main {
  	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int x = 0;
	for (int i = 0; i<4; i++){
		if ( args[0].charAt(i) == '+' ) x++;
	}
		
	System.out.println((x - 2)*2);
	
}