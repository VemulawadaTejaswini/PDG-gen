import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int D = sc.nextInt();
    	int total = 0;

    	if(A>=B){
    		total += A;
    	}else{
    		total+=B;
    	}
    	if(C>=D){
    		total +=C;
    	}else{
    		total +=D;
    	}



    	System.out.println(total);

}

}