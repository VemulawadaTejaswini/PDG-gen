import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      	int b=sc.nextInt();
      	ArrayList<Integer> al=new ArrayList<Integer>();
     for(int i=1;i<=Math.min(a,b);i++){
     	if((a%i==0)&&(b%i==0)){
        	al.add(i);
        }
     }
      int c=0;
      for(int e:al){
      if(Prime(e)){c++;}
        }
      
      System.out.println(c);
        
    }
  
      public static boolean Prime(int n){
      		if(n==1){
           		return true;
            }else if(n==2){
              return true;
            }else{
            	for(int d=2;d<n;d++){
                    if(n%d==0){return false;}
                }
              return true;
            }
      }
}