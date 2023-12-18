import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int taist = 0;
    int sum =0;
    if(l+n-1 < 0){
      taist = l+n-1;
    } else if(l > 0){
      taist = l; //n=1のりんご
    } else {
      taist = 0; //l+n-1=0のりんご
    }
    for(int i=1;i<=n;i++){
      sum +=l+i-1;
    }
    System.out.println(sum-taist);
  }
}