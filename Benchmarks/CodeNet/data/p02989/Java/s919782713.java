import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] d=new int[n];
		for(int c=0;c<n;c++){
    		d[c]=sc.nextInt();
    	}
  		Arrays.sort(d);
  		

    	System.out.println(d[n/2+1]-d[n/2]);
    }
}