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
        int[] L = new int[Q];
        int[] R = new int[Q];
        
        for(int i=0;i<Q;i++){
        	L[i] = sc.nextInt();
        	R[i] = sc.nextInt();
        }
        
        for(int i=0;i<Q;i++){
        	
        	int ans = 0;
        	
        	for(int j=0;;){
        		
        		if(L[i]==R[i]){
        			System.out.println(ans);
        			break;
        		}
        		
        		ans += Math.abs(number[L[i]][0]-number[L[i]+D][0]);
        		ans += Math.abs(number[L[i]][1]-number[L[i]+D][1]);
//        		System.out.println(nacumber[L][0]+" "+number[L][1]);
        		L[i] += D;
        		
        		
        	}
        }
        		
	}

		

    
}