import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int r = scan.nextInt();
	int g = scan.nextInt();
	int b = scan.nextInt();
	int n = scan.nextInt();	      

	/* 組み合わせを考える */
	int count = 0;
	for(int i = 0; i < n/r+1; i++){
	    for(int j = 0; j < n/g+1; j++){
		for(int k = 0; k < n/b+1; k++){
		    if(i*r+g*j+b*k > n){
			break;
		    }else if(i*r+g*j+b*k == n){
			count++;
		    }
		}
	    }
	}


	System.out.println(count);
    }
}
