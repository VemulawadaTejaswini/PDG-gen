import java.util.*;

public class Main {

   	private static final int DATASET = 30;

    public static void main(String[] args) {
    	
        //input
         Scanner sc = new Scanner(System.in);

         int[] n = new int[DATASET];
         
         int input_size = 0;
//         while(sc.hasNext()){
         for(int i=0;i<3;i++){
        	n[input_size] = sc.nextInt();
        	input_size++;
         }

         //The maximum is computed.
         int max = 0;
         for(int i=0;i<input_size;i++){
        	 if(max < n[i]){max = n[i];}
         }
         max++;

         boolean prm[] = new boolean[max];
         
         //make prime table
         prm[0] = false;
         prm[1] = false;
         for(int i=2;i<max;i++){prm[i] = true;}
         for(int i=2;i<max;i++){
        	 if(!prm[i]){continue;}
        	 for(int j=i*2;j<max;j+=i){
        		 prm[j] = false;
        	 }
         }

         //make prime count table
         int cnt = 0;
         int[] prm_cnt = new int[max];
         for(int i=0;i<max;i++){
        	 if(prm[i] == true){cnt++;}
        	 prm_cnt[i] = cnt;
         }
         
         //search prime count table　 with input values.
         int[] ans = new int[input_size];
         for(int i=0;i<input_size;i++){
        	 ans[i] = prm_cnt[n[i]];
         }
         
         //output         
         for (int i:ans) {System.out.println(i);}
    }
}