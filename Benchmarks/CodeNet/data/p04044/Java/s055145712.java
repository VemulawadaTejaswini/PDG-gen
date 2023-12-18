import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),l=sc.nextInt();
    StringBuffer sb=new StringBuffer();
    String[] strs=new String[n];
    for(int i=0;i<n;i++){
      strs[i]=sc.next();
    }
    Arrays.sort(strs);
    for(int i=0;i<n;i++){
      sb.append(strs[i]);
    }
    System.out.println(sb);
  }
}