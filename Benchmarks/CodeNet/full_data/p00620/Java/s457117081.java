import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, sum;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    sum = 0;
	    for(int i=0; i<n*n; i++)
		sum += sc.nextInt();
	    System.out.println(sum==0 ? "YES":"NO");
	}
    }
}