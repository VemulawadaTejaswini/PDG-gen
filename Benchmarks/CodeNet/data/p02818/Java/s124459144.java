import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int cookieOfTakaHashi = sc.nextInt();
      	int cookieOfAoki = sc.nextInt();
      	int reception = sc.nextInt();
      	
      	for (int i = 0; i < reception; i++) {
			if(cookieOfTakaHashi > 0) {
				cookieOfTakaHashi -= 1;
			}else{
				cookieOfAoki -= 1;
			}
		}
      	System.out.println("高橋くんのクッキーは" + cookieOfTakaHashi + "枚");
      	System.out.println("青木くんのクッキーは" + cookieOfAoki + "枚");
    }
}