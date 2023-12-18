import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int O = sc.nextInt();
        
        int[] L = new int[M];
        
        for(int i = 0 ; i < M ;i++) {
        	L[i] = sc.nextInt();
        }
        int count = 0;
        int judge = 0;
        
        for(int i = 0 ; i < N ;i++) {
        	for(int m = 0 ; m < M;m++) {
        		int a = sc.nextInt();
        		judge += a*L[m];
        	}
        	if((judge + O) > 0) {
        		count++;
        		judge = 0;
        	}
        }
        System.out.println(count);
    }
}