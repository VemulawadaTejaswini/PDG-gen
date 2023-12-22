import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ary = new int[N][2];
        for(int i = 0; i < N; i++){
        	ary[i][0] = sc.nextInt();
        	ary[i][1] = 1;
        }
        for(int i = 0; i < M; i++){
        	int A1 = sc.nextInt();
        	int A2 = sc.nextInt();
        	if(ary[A1-1][0] < ary[A2-1][0]){
        		ary[A1-1][1] = 0;
        	}else{
        		ary[A2-1][1] = 0;
        	}
        }
        sc.close();
        int ans = 0;
        for(int i = 0; i < N; i++){
        	if(ary[i][1] == 1){
        		ans++;
        	}
        }
        System.out.println(ans);
    }
}