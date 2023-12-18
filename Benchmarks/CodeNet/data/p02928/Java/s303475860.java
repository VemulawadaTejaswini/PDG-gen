import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int K = sc.nextInt();
      
      	int[] number = new int[N];
//	    int[] B = new int[N*K];
      
	    ArrayList<Integer> B = new ArrayList<Integer>();
     	double count = 0;
      	for(int i = 0; i<N; i++){
          number[i] = sc.nextInt();
        }
      	
      	for(int i = 0;i<K;i++){
        	for(int j= 0; j<N; j++){
            	B.add(number[j]);
 	       	}
        }
      
      
      	for(int i = 0;i<K+N;i++){
           System.out.print(B.get(i)+" ");
        }
      
      	for(int i = 0;i<N*K;i++){
          int Bnum = B.get(i);
          for(int j = 0;j<N*K;j++){
            if(i < j){
        	    if(Bnum > B.get(j)){
    	          count++;
	            }
            }
          }
        }
      double num = Math.pow(10, 9) +7;
      count = count % num;
      System.out.println(count);
	}
}