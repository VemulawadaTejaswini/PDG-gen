import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    char[] s=sc.next().toCharArray(),t=sc.next().toCharArray();
    for(int i=0;i<n;i++){
      if(s[n-1-i]==t[i]){
        f++;
      }else{
        break;
      }
    }
    System.out.println(2*n-f);
  }
}
