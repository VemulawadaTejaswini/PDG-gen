	import java.util.Scanner;

        public class Main{ 

	public static void main(String[] args) { 

	Scanner sc = new Scanner(System.in);

	int i;

	int j;

	while (true) { 

	int W= sc.nextInt(); 

	int H= sc.nextInt(); 

	if (W == 0 && H == 0) { 

	break; 

	} 

	for ( j = 0; j < W; j++ ){

    	for ( i = 0; i < H; i++ ){

        System.out.print("#");

    	}

    	System.out.print("\n");

	}

	}

	}

	}