import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String[] s = new String[n];
    boolean flag = true;
    int ans = 0;
    int m = 0;
    
    for(int i=0; i<n; i++){
      String a = sc.next();
      for(int j=0; ((j<i) || (j<ans)); j++){
        if(s[j].equals(a)){
          flag = false;
      	}
      }
       if(flag == true){
         s[i] = a;
         ans++;
       }
      else{
        s[i] = "";
      }
      flag = true;
    }
      
    System.out.println(ans);
  }
}