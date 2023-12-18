import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] d = new int[n];
	int max = 0;
	int count = 0;

	for(int i = 0; i < n; i++){
	    d[i] = scan.nextInt();
	}

	for(int i = 0; i < n-1; i++){
	    for(int j = i+1; j < n; j++){
		if(d[i] > d[j]){
		    int tmp = d[i];
		    d[i] = d[j];
		    d[j] = tmp;
		}
	    }
	}

	for(int i = 0; i < n; i++){
	    if(max < d[i]){
		max = d[i];
		count++;
	    }
	}

	System.out.println(count);
    }
}
