import java.util.*;
class Main {
  public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int odd[] = new int[n/2];
    int even[] = new int[n/2];

    
    int oddans =0;
    int evenans =0;
    int ans =0;
    
    int flag = 0;
   
    
    for (int i=0; i<n/2;i++){
      odd[i] = scan.nextInt();
      even[i] = scan.nextInt();
      }
      
     if(odd[0]==even[0]){
       flag =1;
       }
     
     int count =  0;
     int tmp = 0;
     
     for (int i=0; i<n/2; i++){
        if(odd[i]!=0){
             count =0;
             int compare = odd[i];
             for(int k =0; k<n/2; k++){
                  if(odd[k] == compare){
                        count++;
                        odd[k] = 0;
                  }
             }
        }
       if(count>tmp){
           tmp=count;
       }
     }
   
         
        oddans  = n/2-tmp;
    
        
        
        tmp = 0;
        
        for (int i=0; i<n/2; i++){
        if(even[i]!=0){
             count =0;
             int compare = even[i];
             for(int k =0; k<n/2; k++){
                  if(even[k] == compare){
                        count++;
                        even[k] = 0;
                  }
             }
        }
       if(count>tmp){
           tmp=count;
       }
     }
         
        evenans= n/2-tmp;
   
        
         if(flag == 1&& oddans+evenans  ==0){
           ans = n/2;
           }else{
             ans = evenans +oddans ;
             }
         
         
        
      System.out.println
      (ans);
  }
 
}