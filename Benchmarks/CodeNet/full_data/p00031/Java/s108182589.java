import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
		    boolean flag[] = new boolean[10];
		    int in = s.nextInt();
		    int a = 1024;
		    int n = 0;
     		    for(int i=9 ; i>=0 ; i--){
			a /= 2;
			if(in>=a){
			    in -= a;
			    flag[i] = true;
			    n++;
			}
		    }
		    int b = 1;
		    for(int i=0 ; i<10 ; i++){
			if(flag[i]==true)
			    n--;
			System.out.print(b);
			if(n!=0)
			    System.out.print(" ");
			b *= 2;
		    }
		    System.out.println();
		}
	}
}