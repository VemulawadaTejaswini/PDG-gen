import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int H = scan.nextInt();
	int W = scan.nextInt();

	String[] a = new String[H];
	for(int i = 0; i < H; i++){
	    a[i] = scan.next();
	}
    
	/*
	String[][] a = new String[H][W];
	for(int i = 0; i < H; i++){
	    for(int j = 0; j < W; j++){
		a[i][j] = scan.next();
	    }
	}
	*/

	int[] h = new int[H];
	int[] w = new int[W];
	
	for(int i = 0; i < H; i++){
	    for(int j = 0; j < W; j++){
		if(a[i].charAt(j) == '#'){
		    h[i] = 1;
		    break;
		}
	    }
	}
       
	for(int j = 0; j < W; j++){
	    for(int i = 0; i < H; i++){
		if(a[i].charAt(j) == '#'){
		    w[j] = 1;
		    break;
		}
	    }
	}

	/*
	for(int i = 0; i < H; i++){
	    System.out.println(h[i]);
	}
	for(int i = 0; i < W; i++){
	    System.out.println(w[i]);
	}
	*/
	for(int i = 0; i < H; i++){
	    if(h[i] == 1){
		for(int j = 0; j < W; j++){
		    if(w[j] == 1){
			System.out.print(a[i].charAt(j));
		    }
		}
		System.out.println();
	    }
	}
	
    }
}
