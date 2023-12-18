package Beginner111C;

import java.util.*;

class Main {
  public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int odd[] = new int[100001];
    int even[] = new int[100001];

    
    
    for (int i=0; i<n/2;i++){
      
      odd[scan.nextInt()]++;
      even[scan.nextInt()]++;
      }
    
    int omc=0;
    int omc2=0;
    int om =0;
    
    int emc=0;
    int emc2=0;
    int em =0;
      
     
    for (int i=1; i<100001; i++){
        if(odd[i]==0)continue;
        if(odd[i]>omc){
             omc2=omc;
             omc=odd[i];
             om=i;
        }
     }
    
    for (int i=1; i<100001; i++){
        if(even[i]==0)continue;
        if(even[i]>emc){
             emc2=emc;
             emc=even[i];
             em=i;
        }
     }
    
    int oans=n/2-omc;
    int eans=n/2-emc;
    
    int ans=0;
    
    if(om==em){
    	if(n/2-omc==0 && n/2-emc==0){
    		ans=n/2;
    	}else{
    		ans = Math.min(n-omc-emc2, n-omc2-emc);
    	}
    }else{
    	ans = n-omc-emc;
    }
   

      System.out.println(ans);
  }
 
}
