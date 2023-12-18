import java.util.Scanner;


public class Main {
	
	static int[][] memory;
	
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
   
        int[][] number =new int[H*W+1][2];
        
        int count = 0;
        int[] member = new int[5];
        
        for(int i = 0;i<H;i++){
        	
        	for(int j=0;j<W;j++){
        		
        		int current_number = sc.nextInt();
        		number[current_number][0]= i;
        		number[current_number][1]= j;
        	}
        	
        	
        }
        
        int Q = sc.nextInt();
        
        for(int i=0;i<Q;i++){
        	int L = sc.nextInt();
        	int R = sc.nextInt();
        	int ans = 0;
        	
        	for(int j=0;;){
        		
        		ans += Math.abs(number[L][0]-number[L+D][0]);
        		ans += Math.abs(number[L][1]-number[L+D][1]);
//        		System.out.println(nacumber[L][0]+" "+number[L][1]);
        		L += D;
        		
        		if(L==R){
        			System.out.println(ans);
        			break;
        		}
        	}
        }
        		
	}

		

    
}