	import java.util.Scanner;

	public class Main{ 
	public static void main(String[] args) { 

	Scanner sc = new Scanner(System.in);

	int i;
	int j;
	while (true) { 
	int H= sc.nextInt(); 
	int W= sc.nextInt(); 
	if (H == 0 && W == 0) { 
	break; 
	} 

 	
	for ( j = 0; j < H; j++ ){
    	for ( i = 0; i < W; i++ ){
        System.out.printf("#");
    	}
    	System.out.printf(" \n");
	}
	}
	}
	}