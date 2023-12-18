import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    
    boolean flg = false;
    String pre = "";
    String post = "";
    
    StringBuffer ans = new StringBuffer("");
    
    for(int j=0;j<q;j++){
      if(sc.nextInt()==1){
        flg = !flg;
      }else{
        if(sc.nextInt()==1){
          if(flg){
            post += sc.next();
          }else{
            pre += sc.next();
          }
        }else{
          if(flg){
            pre += sc.next();
          }else{
            post += sc.next();
          }
        }
      }
    }
    StringBuffer sb = new StringBuffer(s);
    StringBuffer spre = new StringBuffer(pre);
    StringBuffer spost = new StringBuffer(post);
    
    
    if(flg){
      spost = spost.reverse();
      sb = sb.reverse();
      
      ans = ans.append(spost);
      ans = ans.append(sb);
      ans = ans.append(spre);
    }else{
      spre = spre.reverse();
      
       ans = ans.append(spre);
      ans = ans.append(sb);
      ans = ans.append(spost);
    }
      

    System.out.println(ans);
      
    

  }
}