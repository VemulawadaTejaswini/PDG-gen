
import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
		int ansA = 0, ansB = 0;
		sc.close();
		
        
        for(int i=-1000; i<1000; i++) {
        	for(int j = -1000; j < 1000; j++){
				if(Math.pow(i,5) - Math.pow(j,5) == X){
					ansA = i;
					ansB = j;
				}
			}
		}
		System.out.println(ansA + " " + ansB);

	}
}

