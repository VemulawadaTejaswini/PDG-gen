import java.util.Scanner;

class Main{

    public static void main(String[] args){

	String input;
	char[] data = new char[1000];
	char[] stock = new char[1000];
	int x,point,slength,total;
	total = 0;

	Scanner scan = new Scanner(System.in);

	while(true){

	    input = scan.next();
	    slength = input.length();


	    for(int i = 0; i < slength; i++){
		data[i] = input.charAt(i);
	    }

	    if(data[0] == '-'){
		break;
	    }

	     x = scan.nextInt();

	    for(int i = 0; i < x; i++){
		point = scan.nextInt();

		for(int j = 0; j < point; j++){
		    stock[j] = data[j];
		}

		for(int j = point; j < slength; j++){
		    data[j - point] = data[j];
		}

		for(int j = point, k = 0; j > 0; j--, k++){
		    data[slength - j] = stock[k];
		}
	    }
	    for(int i = 0; i < slength; i++){

		System.out.print(data[i]);
	    }
	    System.out.println();
	}
    }
}