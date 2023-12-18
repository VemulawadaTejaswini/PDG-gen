import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
          
        int n = scan.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        long A_plus_B[] = new long[n];
        
        boolean isAturn = true;
        
        for(int i = 0 ; i < n ; i++){
          A[i] = scan.nextInt();
          B[i] = scan.nextInt();
          A_plus_B[i] = (long)A[i] + (long)B[i];
        }
        
        long A_sum = 0;
        long B_sum = 0;
        long cnt = 0;
        
        int maxIndex, maxValue;
        
        for(int i = 0 ; i < n ; i++){
          maxIndex = 0;
          maxValue = 0;
          
          if(isAturn){
            for(int j = 0 ; j < A.length ; j++){
              if( maxValue < A_plus_B[j] ){
                maxValue = (int)A_plus_B[j];
                maxIndex = j;
              }
            }
            
            A_sum += A[maxIndex];
            
            A[maxIndex] = 0;
            B[maxIndex] = 0;
            A_plus_B[maxIndex] = 0;
            /*
            List<Integer> listA = new ArrayList<Integer>(Arrays.asList(A));
            List<String> listB = new ArrayList<String>(Arrays.asList(B));
            List<String> listAB = new ArrayList<String>(Arrays.asList(A_plus_B));
            
            listA.remove(maxIndex);
            listB.remove(maxIndex);
            listAB.remove(maxIndex);
            
            A = listA.toArray(new String[listA.size()]);
            B = listB.toArray(new String[listB.size()]);
            A_plus_B = listAB.toArray(new String[listAB.size()]);
            */
            
            isAturn = false;
            
          }
          
          else{
            for(int j = 0 ; j < A.length ; j++){
              if( maxValue < A_plus_B[j] ){
                maxValue = (int)A_plus_B[j];
                maxIndex = j;
              }
            }
            
            B_sum += B[maxIndex];
            
            A[maxIndex] = 0;
            B[maxIndex] = 0;
            A_plus_B[maxIndex] = 0;
            
            
            isAturn = true;
            
          }
          
        }
        cnt = A_sum - B_sum;
            
        System.out.println(cnt);
	  }
}