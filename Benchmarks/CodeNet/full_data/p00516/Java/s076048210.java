import java.util.*;
public class Main {
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int m = sc.nextInt();
		  int k[]=new int[n];
		  int h[]=new int[m];;
		  int count[]=new int[n];;
		  for(int i=0;i<n;i++){
			  k[i] = sc.nextInt();
		  }			
		  for(int j=0;j<m;j++){
			  h[j]=sc.nextInt();
		  }
		  for(int a=0;a<m;a++){
			  
			  for(int b=0;b<n;b++){
				  if(k[b]<=h[a]){count[b]++;
				  break;
			  }  
			 }
		  }
			  int max = 0;
			  int event =0;
			  for (int i = 0; i<n;i++){
			  if(max<=count[i]){
				  max=count[i];
				  event=i+1;}
			  }
			  System.out.println(event);		
	 }
}
	