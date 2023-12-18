import java.util.Scanner;

public class Main {
	  public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];
            int[] count = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                count[i] = 0;
                while(a[i] % 2 == 0){
                    a[i] /= 2;
                    count[i]++;
                }
            }
            int mincount = count[0];
            for(int i = 0; i < n; i++){
                if(mincount > count[i]){
                    mincount = count[i];
                }
            }
            System.out.println(mincount);
            sc.close();
		  }
}