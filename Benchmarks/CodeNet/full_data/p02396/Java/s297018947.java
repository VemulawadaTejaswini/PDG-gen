import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10000];
    int i=0;
    while(1==1){
      a[i] = sc.nextInt();
      if(a[i]==0) break;
      i++;
    };
    for(int j=0;j<i;j++){
      System.out.println("Case "+j+1+": "+a[j]);
    }
  }
}

