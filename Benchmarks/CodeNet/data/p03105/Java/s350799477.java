import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int d =0;

    	for(int i =0;i<C;i++){

    		if(A<=B){
    			B -=A;
    			d++;
    		}

    	}


    	System.out.println(d);

}


}
