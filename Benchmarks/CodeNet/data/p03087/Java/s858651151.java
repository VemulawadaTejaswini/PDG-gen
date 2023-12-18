import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] r = new int[q];
    int[] l = new int[q];
    
    for(int i=0; i<2*q; i++){
      if(i%2 == 0){
        r[i/2] = sc.nextInt();
      }else{
        l[i/2] = sc.nextInt();
      }
    }
    
    for(int j=0; j<q; j++){
      String[] words = s.substring(r[j]-1, l[j]+1).split("AC", -1);
      System.out.println(words.length -1);
    }
  }
}
