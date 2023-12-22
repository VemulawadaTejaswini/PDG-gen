import java.util.Scanner;

class test{

    public static void main(String[] args){

	int x,i,j;
	String stock;
    
	Scanner scan = new Scanner(System.in);


	x = scan.nextInt();
       	String[] data = new String[x];

	for(i = 0; i < x; i++){
	    data[i] = scan.next();
	}

	for(i = 0; i < 1; i++){
	    for(j = 1; j < x; j++){
		if(data[i].compareTo(data[j]) > 0){
		    stock = data[i];
		    data[i] = data[j];
		    data[j] = stock;
		}
	    }
	}
	System.out.println(data[0]);
    }
}
		