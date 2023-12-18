import java.util.*;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  	int N = sc.nextInt();
  	int[] T = new int[N];
  	for(int i=0 ; i < N ; i++){
  		T[i] = sc.nextInt();
  	}
  	int M = sc.nextInt();
  	int[][] PM = new int[M][2];
  	for(int i=0 ; i < M ; i++){
		PM[i][0]= sc.nextInt();
  		PM[i][1]= sc.nextInt();
  	}
 
    
  	for(int i=0 ; i < M ; i++){
  		int ans=0;
  		for(int j=0 ; j < N ; j++){
  			if(PM[i][0]==j+1){
  				ans +=PM[i][1];
  			}else{
  				ans +=T[j];
  			}
  		}
  		System.out.println(ans);
  	}
    
  }
}