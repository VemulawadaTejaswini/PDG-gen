import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
  		int[] a=new int[(int)Math.pow(10,5)];
		for(int c=0;c<n;c++){
    		a[sc.nextInt()]++;
    	}
  		int max=0;
  		for(int c=0;c<(Math.pow(10,5)-2);c++){
        max=Math.max(max,a[c]+a[c+1]+a[c+2]);
        
        }
    

    	System.out.println(max);
    }
}