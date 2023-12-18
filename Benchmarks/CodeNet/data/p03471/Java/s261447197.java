import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    int Y;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.Y = sc.nextInt();
    }
    
    //解答処理
    private int[] solve() {
        int[] answer = new int[3];
        answer[0] = -1;	//10000円
		answer[1] = -1;	//5000円
		answer[2] = -1;	//1000円
        
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
              int k = N-i-j;
              if(Y == 10000*i + 5000*j + 1000*k){
            	  answer[0] = i; //10000円
            	  answer[1] = j; //5000円
            	  answer[2] = k; //1000円
              }
            }
          }
        
        return answer;
    }
    
    //出力
    public void show(int[] answer) {
    	for (int i=0; i<3; i++) {
    		System.out.print(answer[i]);
    		System.out.print(" ");	
    	}
    }

}
