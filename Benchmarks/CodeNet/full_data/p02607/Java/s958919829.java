import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int d=0;
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
            if(c%2==1&&a[c]%2==1){
            d++;
            }
    	}
    

    	System.out.println(d);
    }
}
