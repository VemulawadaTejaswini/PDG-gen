import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int H = sc.nextInt();
	    int W = sc.nextInt();
	    if(H == 0 && W == 0){
		break;
	    }else{
		for(int j=0;j<W;j++){
			System.out.print("#");
		    }System.out.printf("\n");
		for(int i=0;i<(H-2);i++){
		    System.out.print("#");
		    for(int k=0;k<(W-2);k++){
			System.out.print(".");
		    }System.out.print("#\n");
		}
		for(int j=0;j<W;j++){
			System.out.print("#");
		    }System.out.printf("\n");
	    }System.out.printf("\n");
	}
    }
}