import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
  		int b=0;
		
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
          if(a[c]==1){
          b=c+1;
          }
    	}
        int count=0;
        count+=(b-1)/(k-1);
       if((b-1)%(k-1)!=0){
       count++;
       }
       count+=(n-b)/(k-1);
       if((n-b)%(k-1)!=0){
       count++;
       }
  

    	System.out.println(count);
    }
}
