import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int nam[] = new int[n];
        int flag = 0;
      
      for(int i = 0; i < n ;i++){
      nam[i] = in.nextInt();
      }
      
      int look = 0;
      for(int i = 0;i < n-1 ; i++){
        
       if(nam[i]<look&i>1){flag=1;break;}
        
       if(nam[i]>nam[i+1]){
         if(nam[i]-nam[i+1]>1){flag=1;break;}
         else{nam[i] -=1;}
         }     
        
       else if(nam[i]<nam[i+1]){
         nam[i+1] -= 1; 
       }
        
       else if(nam[i]==nam[i+1]){
         look=nam[i];
       }
      }

      
    if(flag==1||look>nam[n-1]){System.out.print("No");}
    else{System.out.print("Yes");}
      
	}
}
