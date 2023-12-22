import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    sc.close();
    int[] count = new int[n];

    for (int x=1; x<=100; x++) {
    	count[x-1]=0;
    	for (int y=1; y<=100; y++) {
    		for (int z=1; z<=100; z++){
    			if (x*x+y*y+z*z+x*y+x*z+y*z == n) count[x-1]++;
    		}
        }
   	}

    for (int i=1; i<n; i++) {
      System.out.println(count[i]);
    }
  }
}