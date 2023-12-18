import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double m=sc.nextDouble();
		double s=0;

  		double[] a=new double[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
          	s+=a[c];
    	}
  
  		double e=s/(4*m);
  		int count=0;
    
		for(int c=0;c<n;c++){
        	if(a[c]>=e){
            	count++;
            }
        }
 	if(count>=m){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }



    }
}

