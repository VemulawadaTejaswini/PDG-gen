import java.util.Scanner;

class Main {
	public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] snake = new int[n];
    for(int i=0; i<n; i++) {
    	snake[i]= scan.nextInt();
    }
    for(int i=0; i<n-1; i++) {
    	if(snake[i]<snake[i+1]) {
    		int l = snake[i+1];
    		snake[i]=snake[i+1];
    		snake[i+1]=snake[i];

    	}
    }
    int max = 0;
    for(int i=0; i<k-1; i++) {
    	max+=snake[i];
    }
    System.out.println(max);
	}
}