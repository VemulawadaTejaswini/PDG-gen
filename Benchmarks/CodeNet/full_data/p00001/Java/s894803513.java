import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		
		int kari;
	
		Scanner scan = new Scanner(System.in);
	
	int[] taller = new int[3];
	
		for(int i=0; i<3; i++){
			taller[i] = 0;}
	
	for(int i=0; i<10; i++){
		int tall = scan.nextInt();
		if(taller[2]<=tall){
			taller[2] = tall;
		if(taller[1]<=taller[2]){
			kari = taller[2];
			taller[2] = taller[1];
			taller[1] = kari;
		if(taller[0]<=taller[1]){
			kari = taller[1];
			taller[1] = taller[0];
			taller[0] = kari;}}}}
			
			
	for(int i=0; i<3; i++){
		System.out.println(taller[i]);}
	}
}
