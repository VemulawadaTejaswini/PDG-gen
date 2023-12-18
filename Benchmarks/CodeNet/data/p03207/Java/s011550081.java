import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] p = new int[n];
	int max = 0;
	int max_num = 0;
	for(int i = 0; i < n; i++){
	    p[i] = scan.nextInt();
	    if(max < p[i]){
		max = p[i];
		max_num = i;
	    }
	}

	p[max_num] = p[max_num] / 2;

	int sum = 0; 
	for(int i = 0; i < n; i++){
	    sum += p[i];
	}
	System.out.println(sum);
    }
}
		
