import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    int m =  sc.nextInt();
 	long h[] = new long[n];
 	boolean jud[] = new boolean[n];
 	int c =0;

    for(int i=0;i<n;i++) {
    	h[i] = sc.nextLong();
    	jud[i] = false;
    }

    for(int i=0;i<m;i++) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	if(h[a-1]<h[b-1]) {
    		jud[a-1] =true;
    	}
    	else if(h[a-1]>h[b-1]){
    		jud[b-1] =true;
    	}
    	else if(h[a-1]==h[b-1]) {
    		jud[a-1] =true;
    		jud[b-1] =true;
    		}
    }

    for(int i=0;i<n;i++) {
    	if(jud[i]==true) {
    		c++;
    	}
    }
    for(int i=0;i<n;i++) {
    System.out.println(jud[i]);}
    System.out.println(n-c);
  }
}