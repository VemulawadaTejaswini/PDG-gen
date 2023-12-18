import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

    for(int i=-K+1; i<0; i++){
        System.out.print(X+i +" ");
}
    for(int j=0; j<K; j++){    
		System.out.print(X+j +" ");	    
	}
}
}