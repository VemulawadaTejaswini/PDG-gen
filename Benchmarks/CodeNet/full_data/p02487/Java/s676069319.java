import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i;
	int j;
	while(true){
	    int H = sc.nextInt();
	    int W = sc.nextInt();
	    if(H == 0 && W == 0){
	    break;
	    }

	    for(j = 0; j < W; j++){
		System.out.printf("#");
	    }

	    System.out.printf("\n");

	    for(i = 1; i < H - 1; i++){
		System.out.printf("#");
		for(j = 1; j < W - 1; j++){
		    System.out.printf(".");
		}
		System.out.printf("#\n");
	    }

	    for(j = 0; j < W; j++){
		System.out.printf("#");
	    }

	    System.out.printf("\n");
	}
    }
}