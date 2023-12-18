import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] n = new int[101];
	int[] c = new int[3];
	for(int i = 0; i < 3; i++){
	    c[i] = scan.nextInt();
	    n[c[i]]++;
	}

	int count = 0;
	for(int i = 1; i < 101; i++){
	    if(n[i] != 0){
		count++;
	    }
	}

	System.out.println(count);
    }
}
