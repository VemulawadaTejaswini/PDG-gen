import java.util.*;
  public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String[] a={"AC","WA","TLE","RE"};
    int[] i={0,0,0,0};
    for(int e=0;e<N;e++){
    String s=sc.next();
     for(int x=0;x<4;x++){
     if(s.equals(a[x])) i[x]++;
     }
    }
    for(int c=0;c<4;c++) System.out.printf("%s × %d\n",a[c],i[c]);
  }
}  