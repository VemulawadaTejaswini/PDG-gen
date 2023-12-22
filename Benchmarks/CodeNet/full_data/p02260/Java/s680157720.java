import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(),count = 0,tintin = 0;
    int[] n = new int[N];
    int[] judge = new int[N];
    
    for(int i = 0; i < N; i++)
    	n[i] = sc.nextInt();
    
    for(int i = 0; i < N; i++)
    	judge[i] = i + 1;
    
    for(int i = 0; i < (N * (N - 1) * 2); i++){
    	for(int k = 0; k < N - 1; k++){
    	tintin = 0;
    	int x = n[k];
    	if(n[k] > n[k + 1]){
    		n[k] = n[k + 1];
    		n[k + 1] = x;
    		count++;
    	}
    	for(int j = 0; j < N; j++)
    		if(n[j] == judge[j])tintin++;
    	
    	if(tintin == N)break;
    }
    }
    for(int i = 0; i < N; i++)
    	if(i != N - 1)
    		System.out.print(n[i] + " ");
    	else
    		System.out.println(n[i]);
    
    if(N != 1)
    	System.out.println(count / 3);
    else
    	System.out.println(1);
    
    sc.close();
  }
}