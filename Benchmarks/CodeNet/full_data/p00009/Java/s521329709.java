import java.util.Scanner;

class Main {
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int upper = stdin.nextInt();
	boolean[] list = new boolean[upper + 1];
	int limit = (int)Math.sqrt(upper);
	int n = 2;
	while(n <= limit){
	    for(int i = 2 * n; i <= upper; i += n){
		list[i] = true;
	    }
	    n++;
	    while(list[n]){
		n++;
	    }
	}
	int count = 0;
	for(int i = 2; i <= upper; i++){
	    if(!list[i]){
		count++;
	    }
	}
	System.out.println(count);
    }
}

    