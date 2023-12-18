import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    
    int[] t = new int[q];
    int[] f = new int[q];
    char[] c = new char[q];
    
    for(int i=0;i<q;i++){
      t[i] = sc.nextInt();
      if(t[i] == 2){
        f[i] = sc.nextInt();
        c[i] = sc.next().charAt(0);
      }
    }
    StringBuffer sb = new StringBuffer(s);
    
    for(int j=0;j<q;j++){
      if(t[j]==1){
        sb.reverse();
      }else{
        if(f[j]==1){
          sb.reverse();
          sb.append(c[j]);
          sb.reverse();
        }else{
          sb.append(c[j]);
        }
      }
    }

    System.out.println(sb);
      
    

  }
}