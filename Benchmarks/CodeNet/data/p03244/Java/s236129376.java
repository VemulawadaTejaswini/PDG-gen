import java.util.*;
class Main {
  public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int odd[] = new int[n/2];
    int even[] = new int[n/2];

    
    int oddans =0;
    int evenans =0;
    int oddans2=0;
    int evenans2 =0;

    int ans =0;
   
    
    for (int i=0; i<n/2;i++){
      odd[i] = scan.nextInt();
      even[i] = scan.nextInt();
      }
      
     
     
     int count =  0;
     int tmp2 =0;
     int tmp = 0;
     int maxodd = 0;
     int maxeven =0;
     int maxodd2 =0;
     int maxeven2 =0;
     int m =0;
     
     for (int i=0; i<n/2; i++){
        if(odd[i]!=0){
             count =0;
             int compare = odd[i];
             for(int k =0; k<n/2; k++){
                  if(odd[k] == compare){
                        count++;
                        m = odd[k];
                        odd[k] = 0;
                  }
             }
        }
       if(count>tmp){
           tmp2 = tmp;
           tmp=count;
           
           maxodd = m;
       }
     }
   
         
        oddans  = n/2-tmp;
        oddans2  = n/2-tmp2;
    
        
        
        tmp = 0;
        m=0;
        
        
        for (int i=0; i<n/2; i++){
        if(even[i]!=0){
             count =0;
             int compare = even[i];
             for(int k =0; k<n/2; k++){
                  if(even[k] == compare){
                        count++;
                        m= even[k];
                        even[k] = 0;
                  }
             }
        }
       if(count>tmp){
           tmp2=tmp;
           tmp=count;
           maxeven = m;
       }
     }
         
        evenans= n/2-tmp;
        evenans2=n/2-tmp2;
        
         if(maxeven  == maxodd && oddans+evenans  ==0){
           ans = n/2;
           }else if(maxeven == maxodd ){
             ans = Math.min(oddans+evenans2, oddans2+evenans);
           }else{
             ans = evenans +oddans ;
             }
        
      System.out.println
      (ans);
  }
 
}