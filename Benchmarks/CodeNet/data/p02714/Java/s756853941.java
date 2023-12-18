import java.util.*;
class Main{  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    
    int ans = 0;
    
    for(int i=1;i<=n-2;i++){
      if(s.charAt(i-1) =='R'){
        for(int j=i+1;j<=n-1;j++){
          if(s.charAt(j-1) =='G'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='B'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
          if(s.charAt(j-1) =='B'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='G'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
        }
      }
    }
    for(int i=1;i<=n-2;i++){
      if(s.charAt(i-1) =='G'){
        for(int j=i+1;j<=n-1;j++){
          if(s.charAt(j-1) =='R'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='B'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
          if(s.charAt(j-1) =='B'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='R'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
        }
      }
    }
    for(int i=1;i<=n-2;i++){
      if(s.charAt(i-1) =='B'){
        for(int j=i+1;j<=n-1;j++){
          if(s.charAt(j-1) =='G'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='R'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
          if(s.charAt(j-1) =='R'){
            for(int k=j+1;k<=n;k++){
              if(s.charAt(k-1) =='G'){
                if(j-i != k-j)
                  ans +=1;
              }
            }
          }
        }
      }
    }    
    
    
    System.out.println(ans);
  }
}