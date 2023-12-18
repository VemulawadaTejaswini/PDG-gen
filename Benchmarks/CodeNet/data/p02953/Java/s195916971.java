import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
	int[] H = new int[N];
  	int cnt=1;
  
	for(int j=0;j<N;j++){
      H[j] = sc.nextInt();
    }
  
  	for(int i=0;i<N-1;i++){
      if(H[i]>H[i+1]){
      	H[i]--;
      }
    }
  
  	for(int k=0;k<N-1;k++){
      if(H[k]<=H[k+1]){
        cnt++;
      }
    }
  	
	if(cnt == N){
		System.out.println("Yes");
    }else{
      	System.out.println("No");
    }
}
}