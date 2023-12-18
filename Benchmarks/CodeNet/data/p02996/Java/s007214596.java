import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   
  		int[][] ab=new int[n][2];
		for(int c=0;c<n;c++){
    		ab[c][0]=sc.nextInt();
          	ab[c][1]=sc.nextInt();
    	}
  	long count=0;
    Arrays.sort(ab,(a,b)->a[1]-b[1]);
 		for(int d=0;d<n;d++){
        	count+=ab[d][0];
          if(count>ab[d][1]){
           System.out.println("No");
            return;
          }
        }

    	System.out.println("Yes");
    }
}