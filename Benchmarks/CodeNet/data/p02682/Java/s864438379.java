import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;
        int max = 0;
        //int max = Math.pow(10,9);
        int a = 1;
        int b = 0;
        int c = -1;
        
        for(int i=0; i<K-2 ; i++) {
          for(int j=i+1; j<K-1 ; j++) {
            for(int k=j+1; k<K ; k++) {
              sum = a*i + b*j + c*k;
              if(sum>=max) {
                max = sum;
              }
            }
          }
        }
       System.out.println(max);
    }
}