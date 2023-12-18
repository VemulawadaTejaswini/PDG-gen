import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();
	int[] black = new int[n];
	int[] white = new int[n];

	int b = 0;
	int w = 0;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == '#'){
		b++;
	    }else{
		w++;
	    }
	    black[i] = b;
	    white[i] = w;
	}

	int count = Integer.MAX_VALUE;
	for(int i = 0; i < n; i++){
	    int tmp = black[i] + (white[n-1]-white[i]);
	    if(tmp < count){
		count = tmp;
	    }
	}

	System.out.println(count);
    }
}
		
