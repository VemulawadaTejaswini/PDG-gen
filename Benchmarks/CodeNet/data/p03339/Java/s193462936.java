import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        String S = sc.next();
        char[] A = S.toCharArray();

        
        int sum[];
        sum = new int[N];
        
        int sumW[];
        sumW = new int[N];
        int sumE[];
        sumE = new int[N];

        for(int m = 0;m < N;m++){
            int countE = 0;
            int countW = 0;
            if(A[m] == 'W'){
                countW++;
                
            }else{
                countE++;
            }
            if(m < 1){
                sumW[m] = countW;
                sumE[m] = countE;
            }else{
            sumW[m] = countW + sumW[m-1];
            sumE[m] = countE + sumE[m-1];
            }
        
        } 
        

        for(int i = 0;i < N;i++){
            if(i < 1){
                sum[i] = sumE[N-1] - sumE[i];
            }else if(i == N - 1){
                sum[i] = sumW[i];
            }else{
            sum[i] = sumW[i-1] + (sumE[N-1] - sumE[i]);
            }
        }

        //for(int i = 0; i < N;i++){
          //  int count = 0;
            //for(int n = 0;n < i;n++){
              //  if(A[n] == 'W'){
                //    count++;
                //}
           // }
            //for(int reader = i + 1; reader < N; reader++){
              //  if(A[reader] == 'E'){
                //    count++;
                //}
            //}
            //sum[i] = count;
            
       // }

        int min = sum[0];
            for(int i = 1;i < N;i++){
                int n = sum[i];
                if(n < min){
                min = n;
                }
            }
            System.out.println(min);
            
    }
}
