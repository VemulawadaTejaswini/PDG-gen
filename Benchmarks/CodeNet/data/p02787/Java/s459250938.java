import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int n=sc.nextInt();
	
  		double[] a=new double[n];
  		double[] b=new double[n];
  		int e=0;
  
		for(int c=0;c<n;c++){
    		a[c]=sc.nextDouble();
          	b[c]=sc.nextDouble();
     
    	}
  		
  		for(int d=0;d<n-1;d++){
          if(a[e]/b[e]<a[d+1]/b[d+1]){
          	e=d+1;
          }
        
        }
  
    	int ans=0;
   while(h>a[e]){
     h-=a[e];
     ans+=b[e];
   
   }
  
  	for(int f=0;f<n;f++){
      if(a[f]<h){
      	b[f]=10000;
      }
    
    }
  	
   Arrays.sort(b); 
 	ans+=b[0];

    	System.out.println(ans);
    }
}