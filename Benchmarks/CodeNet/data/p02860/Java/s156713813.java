import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    
    String bf = "";
    String af = "";
    
    for(int i=0; i<n/2; i++){
      bf += c[i];
    }
    
    for(int j=n/2; j<n; j++){
      af += c[j];
    }
    
    if(bf.equals(af)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
