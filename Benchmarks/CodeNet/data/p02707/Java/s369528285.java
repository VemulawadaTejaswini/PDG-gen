import java.util.*; 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
  		int[] a=new int[n];
		for(int c=0;c<n-1;c++){
    		a[sc.nextInt()-1]++;
          }
  
    for(int ans: a){
    System.out.println(ans);
    }
  
    }

}
