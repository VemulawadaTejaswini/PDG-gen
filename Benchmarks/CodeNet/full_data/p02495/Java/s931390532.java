import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    while(true){
		    int H = sc.nextInt();
		    int W = sc.nextInt();
		    if(H == 0 && W ==0){
			    break;
			}
		    if(H < 1 || W > 300){
			    break;
		    }
		    for(int i = 1;i <= H;i++){
			    for(int j = 1;j <= W; j++){
				    if(i % 2 == 1 && j % 2 == 1){
					    System.out.printf("#");
				    }
				    if(i % 2 == 1 && j % 2 == 0){
					    System.out.printf(".");
				    }
				    if(i % 2 == 0 && j % 2 == 1){
					    System.out.printf(".");
				    }
				    if(i % 2 == 0 && j % 2 == 0){
					    System.out.printf("#");
				    }
			    }
			    System.out.println("");
		    }
		    System.out.println("");
	    }
    }
}