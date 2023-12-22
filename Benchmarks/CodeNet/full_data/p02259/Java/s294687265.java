

import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[n];
 
      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }
      bubbleSort(array, array.length);
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static void bubbleSort(int[] A, int N)
  {
	  int swapNum = 0;
    StringBuilder sb = new StringBuilder(); 
    for(int i = 0; i < N - 1; ++i){
    	for(int j = N - 1;j > i;--j){
    		if(A[j] < A[j - 1]){
    			final int tmp = A[j];
    			A[j] = A[j - 1];
    			A[j - 1] = tmp;
    			swapNum++;
    		}
    	}
    }
    show(A,sb);
    System.out.println(Integer.toString(swapNum));
    
  }
  
  public static void show(int[] A,StringBuilder sb){
	    for(int i = 0;i < A.length;++i){
	    	sb.append(A[i]);
	    	if(i + 1 < A.length){
	    		sb.append(" ");
	    	}
	    }
	    System.out.println(sb.toString());
	    sb.setLength(0);
  }
}