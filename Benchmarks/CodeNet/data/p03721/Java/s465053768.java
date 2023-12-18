import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int a[] = new int[N];
    int b[] = new int[N];
    int min = 0;
    boolean ans = true;
    
    for(int i = 0; i<N ;i++){
    	a[i] = sc.nextInt();
    }
    for(int i = 0; i<N ;i++){
    	b[i] = sc.nextInt();
    }
    
    while(ans == true){
    	min = a[0];
    	int min1 = 0;
    	for(int i = 0; i < N; i++){
    		if(min > a[i]){
    			min = a[i];
    			min1 = i;
    		}
    	}
    	if(b[min1]<K){
    		K = K-b[min1];
    		a[min1] = 9999999;
    	}else if(b[min1]>=K){
    		ans = false;
    		System.out.println(a[min1]);
    	}
    }
  }
}