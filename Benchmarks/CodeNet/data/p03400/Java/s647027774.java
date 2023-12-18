import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int days = sc.nextInt();
    	int X = sc.nextInt();
    	int P[] = new int[N];
    	int total =0;


    	for(int i =0;i<N;i++){
    		P[i]=sc.nextInt();

    		}
    	for(int i = 0;i<N;i++){


    		for(int j =1;j<=days;j +=P[i] ){


    				total++;

    		}
    	}

    	total += X;


    	System.out.println(total);

}


}