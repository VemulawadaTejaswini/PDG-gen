import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int i, j;
	while (true) {
	    int H = sc.nextInt();
	    int W= sc.nextInt();
	    if (H == 0 && W == 0){
		break;
	    }
	    for(i = 0; i < H; i++){
		if(i % 2 == 0){
		    for(j = 0; j < W; j += 2){
			if(i == W - 2){
			    System.out.printf("#");
			    break;
			}else{
			    System.out.printf("#.");
			}
		    }
		}else{
		    for(j = 0; j < W; j += 2){
			if(i == W - 2){
			    System.out.printf(".");
			    break;
			}else{
			    System.out.printf(".#");
			}
		    }
		}
		System.out.printf("\n");
	    }
	    System.out.printf("\n");
	}
    }
}