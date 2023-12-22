import java.util.*;
import java.math.BigDecimal;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt();
    BigDecimal[] a=new BigDecimal[n],score=new BigDecimal[n-k+1];
    for(int i=0;i<n;i++){
      a[i]=new BigDecimal(sc.next());
      if(i==0){
        score[0]=a[i];
      }else if(i<k){
        score[0]=score[0].multiply(a[i]);
      }else{
        score[i-k+1]=score[i-k];
        score[i-k+1]=score[i-k+1].divide(a[i-k]);
        score[i-k+1]=score[i-k+1].multiply(a[i]);
      }
    }
    for(int i=1;i<n-k+1;i++){
      if(score[i].compareTo(score[i-1])>0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
