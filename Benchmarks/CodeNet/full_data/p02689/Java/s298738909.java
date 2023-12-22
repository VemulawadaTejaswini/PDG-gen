import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
      	Integer H[] = new Integer[N];
      	for(int i=0;i<N;i++){
          H[i] = sc.nextInt();
          
        }
      	
      	Integer A[] = new Integer[M];
      	Integer B[] = new Integer[M];
        for(int j=0;j<M;j++){
          A[j]= sc.nextInt();
          B[j] = sc.nextInt();
        }
      	Set<Integer> num = new HashSet<>();
      	for(int i=0;i<N;i++){
          if(Arrays.asList(A).contains(i+1) || Arrays.asList(B).contains(i+1)){
          for(int j=0;j<M;j++){
            if(A[j] == i+1){
              if(H[A[j]-1] > H[B[j]-1]) num.add(i);
            }
            else if(B[j] == i+1){
              if(H[B[j]-1] > H[A[j]-1]) num.add(i);
            }            
          }
          }
          else num.add(i);
        }
      	
 	      System.out.println(num.size());
    }
}