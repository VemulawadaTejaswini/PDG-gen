import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		int[] b=a.clone(); 
  		Arrays.sort(b);
  		int[] ans=new int[n];
  		int count=0;
  		for(int d=0;d<b.length;d++){
  		for(int c=1;c<b.length;c++){
        	if(b[c-1]==b[c]){
            	count++;
            }else{
              count++;
              if(b[c-1]==a[d]){
               count--;
              } 
              ans[d]+=count*(count-1)/2;
              count=0;
              }
        
        }
        if(b[b.length-1]==a[d]){
               count--;
              } 
          count++;
          ans[d]+=count*(count-1)/2;
          count=0;
          
        }
  		
    for(int e:ans){
    	System.out.println(e);
    }
    
}
}
