import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int place[]=new int[5];
		Scanner sc = new Scanner(System.in);
		int min;
		
		for(int i=0; i<5; i++){
			place[i]=sc.nextInt();
		}
		
		int minp=place[0];
		
		for(int i=1; i<3; i++){
			if(minp>place[i]) minp=place[i];
		}
		
		
		if(place[3]<place[4]){
			min=place[3];
		}
		else{ 
			min=place[4];
		}
		
		System.out.println(min+minp-50);

	}

}