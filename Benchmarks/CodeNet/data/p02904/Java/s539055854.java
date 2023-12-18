import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] p=new int[n];
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
    }
    TreeSet<Integer> s=new TreeSet<>();
    for(int i=0;i<k;i++){
      s.add(p[i]);
    }
    int a=1;
    for(int i=0;i+k<n;i++){
      if(!(p[i]==s.first() && p[i+k]>s.last())){
        a++;
      }
      s.remove(p[i]);
      s.add(p[i+k]);
    }
    System.out.println(a);
  }
}
