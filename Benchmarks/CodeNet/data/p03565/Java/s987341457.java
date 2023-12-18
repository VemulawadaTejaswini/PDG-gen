import java.util.*;

class Main{           
 
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
            
      String S1 = sc.next();
      
      String T = sc.next();
      int l = T.length();
      
      String S3 = "";
      
      for(int i = 0;i < S1.length()-l+1;i++){
          String S2 = S1.substring(i,i+l);
          boolean flag =true;
          for(int j = 0;j < S2.length();j++){
              if(S2.charAt(j) == T.charAt(j) || S2.charAt(j) == '?'){
                  continue;
              }else{
                  flag = false;
                  break;
              }
          }
          if(flag){
           S3 = S1.substring(0,i) + T;
          }                        
      }
      
      if(S3.isEmpty()){
          System.out.println("UNRESTORABLE");
          return;
      }
      
      S3 = S3.replace("?","a");
                  
      System.out.println(S3);
                                                
   }   
 }
  