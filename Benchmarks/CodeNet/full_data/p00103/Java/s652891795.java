import java.util.Scanner;

class Main{

    public static void main(String args[]){

	Scanner scan = new Scanner(System.in); 

	int inning = scan.nextInt();

	int outcount = 0;
	int sum = 0;
	int[] base = new int[3];
	for(int i = 0; i < 3; i++){
	    base[i] = 0;
	}

	String s1 = "HIT";
	String s2 = "HOMERUN";
	String s3 = "OUT";


	int pass = 0;

	while(pass < inning){

	    String in = scan.next();

	    if(in.equals(s1)){
		if(base[2] == 1){
		    sum++;
		}
		base[2] = base[1];
		base[1] = base[0];
		base[0] = 1;
	    }

	    if(in.equals(s2)){
		for(int i = 0; i < 3; i++){
		    if(base[i] == 1){
			sum++;
			base[i] = 0;
		    }
		}
		sum++;
	    }

	    if(in.equals(s3)){
		outcount++;
	    }

	    if(outcount == 3){
		System.out.println(sum);
		sum = 0;
		outcount = 0;
		pass++;
		for(int i = 0; i < 3; i++){
		    base[i] = 0;
		}
	    }

	}
    }
}