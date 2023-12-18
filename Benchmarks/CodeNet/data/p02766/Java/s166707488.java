import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
  		int a=1;
		int ans=0;

  		
		while(n>=a){
         a=a*k;
          ans++;
        }
    
 	

    	System.out.println(ans);
    }
}
