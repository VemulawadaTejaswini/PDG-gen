   import java.util.Scanner;
     
    public class Main {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int []sunuke = new int[N];
        
        int cou = 0;
        for(int i=0; i<K; i++) {
        	int d = sc.nextInt();
        	for(int j=0; j<d; j++) {
        		int A = sc.nextInt();
        		sunuke[A-1]++;
        	}
        }
        for(int i=0; i<N; i++) {
        	if(sunuke[i] == 0) {
        		cou++;
        	}
        }
        System.out.println(cou);
      }
    }