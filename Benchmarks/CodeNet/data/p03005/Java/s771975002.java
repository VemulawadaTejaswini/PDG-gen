import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int [] ary = new int[k];
    int a = 0;
    for(int c = 0;c<k;c++){
      ary[c] = 1;
        n--;
    }
    ary[0] += n; 
    if(k!=1){
    a = ary[0]-ary[1];
    }
    System.out.print(a);
  } 
}
