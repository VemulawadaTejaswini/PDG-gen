import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int h = scan.nextInt();
		String M[] = new String[366];
		for(int i = 0 ; i<366 ; i++){
			if(i%7 == 0){
				M[i] = "Thursday";
			}else if(i%7 == 1){
				M[i] = "Friday";
			}else if(i%7 == 2){
				M[i] = "Saturday";
			}else if(i%7 == 3){
				M[i] = "Sunday";
			}else if(i%7 == 4){
				M[i] = "Monday";
			}else if(i%7 == 5){
				M[i] = "Tuesday";
			}else{
				M[i] = "Wednesday";
			}
		}
		while(t != 0){
			if(t == 1){
				System.out.println(M[h-1]);
			}else if(t == 2){
				System.out.println(M[30+h]);
			}else if(t == 3){
				System.out.println(M[59+h]);
			}else if(t == 4){
				System.out.println(M[90+h]);
			}else if(t == 5){
				System.out.println(M[120+h]);
			}else if(t == 6){
				System.out.println(M[151+h]);
			}else if(t == 7){
				System.out.println(M[181]);
			}else if(t == 8){
				System.out.println(M[212+h]);
			}else if(t == 9){
				System.out.println(M[243+h]);
			}else if(t == 10){
				System.out.println(M[273+h]);
			}else if(t == 11){
				System.out.println(M[304+h]);
			}else{
				System.out.println(M[334+h]);
			}
			t = scan.nextInt();
			h = scan.nextInt();
		}
	}
}