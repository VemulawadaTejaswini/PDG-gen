import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
		
  		int[] a=new int[m];
		for(int c=0;c<m;c++){
    		a[c]=sc.nextInt();
    	}
   Arrays.sort(a);
   int v=a[m-1]-a[0];
   int[] b=new int[m-1];
  
    for(int d=0;d<m-1;d++){
     b[d]=a[d+1]-a[d];
    }
   Arrays.sort(b);
  
   if(n>=m){
    v=0;
   }else{
    for(int c=0;c<n-1;c++){
     v-=b[(m-2)-c];
    }
   }
  
 	

    	System.out.println(v);
    }
}

