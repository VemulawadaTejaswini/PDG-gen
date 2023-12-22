import java.util.*; 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;

  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  
  		Arrays.sort(a);
  if(n==1){
  ans=1;
  }else{
       for(int d=1;d<n;d++){
         if(a[d]==a[d-1]){
         ans++;
         }else{
         int e=0;
       	while(a[e]<=a[d]/2){
        if(a[d]%a[e]==0){
       	 ans++;
          break;
        }
          e++;
        }
         }
       }
		if(a[0]==a[1]){
        ans++;
        }
  }
    	System.out.println(n-ans);
    }
}

    
