import java.util.*;
public class Main {
	public static int [] coin ={500,100,50,10,5,1};
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
        int [] n = new int[6];
       int p= scan.nextInt();
       int check=0;
       ArrayList <Integer> ans =new ArrayList<Integer>();
     for(int i=0;i<6;i++){
    	 n[i] = scan.nextInt();
    	 check |=n[i];
     }
     if((p|check)==0)break;
     
     for(int i=0;i<=n[5]&&i<=p/coin[0]+1;i++){
    	 for(int j=0;j<=n[4]&&i<=p/coin[1]+1;j++){
    		 for(int k=0;k<=n[3]&&i<=p/coin[2]+1;k++){
    			 for(int l=0;l<=n[2]&&i<=p/coin[3]+1;l++){
    				 for(int m=0;m<=n[1]&&i<=p/coin[4]+1;m++){
    					 for(int q=0;q<=n[0]&&i<=p/coin[5]+1;q++){
    						 int sum=coin[0]*i+coin[1]*j+coin[2]*k+coin[3]*l+coin[4]*m+coin[5]*q;
    						 if(sum>=p)ans.add(i+j+k+l+m+q+change(sum-p));
    					 }
    				 }
    			 }
    		 }
    	 }
     }
     int min=6000;
     for(int a :ans)
    	min = Math.min(a, min);
     System.out.println(min);
    	 
     
        }
     
     
        }
  public static int change(int n){
	  int sum=0;
	  for(int i=0;i<6;i++){
		  int k = n/coin[i];
		  if(k!=0)n%=coin[i];
		  sum+=k;
		  if(n==0)break;
	  }
	  return sum;
	  
  }
    }