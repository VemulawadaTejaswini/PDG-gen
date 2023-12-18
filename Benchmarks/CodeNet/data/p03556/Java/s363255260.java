import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long S[] = new long[50000];
    for(int i=1;i<50000;i++){
      S[i]=(long)i*i;
    }
    int tmp=0;
    while(1==1){
      if(N<S[tmp]){
        System.out.println(S[tmp-1]);
        return;
      }else{
        tmp=tmp+1;
      }
    }
    
  }
  

  
}