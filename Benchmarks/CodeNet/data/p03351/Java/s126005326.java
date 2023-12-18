import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		int Y = 1;
		
		Scanner stdIn= new Scanner(System.in);
			int X = stdIn.nextInt();
		
		for(int i=0; i<X;i++){
			for(int j=2;;j++){
				if((Math.pow(i, j)>Y)&&(Math.pow(i, j)<=X)){
					Y = (int) Math.pow(i, j);
				}
				if(Math.pow(i, j)>X) {	
					break;
					
				}
					
				}
			
		}
	
		
		System.out.println(Y);

	
}
}
