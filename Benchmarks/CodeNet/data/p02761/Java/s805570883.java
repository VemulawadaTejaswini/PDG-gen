import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] s=new int[n];
    int[] c=new int[n];
    for(int i=0;i<m;i++){
      s[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    for(int i=0;i<1000;i++){
      String str=String.valueOf(i);
      if(str.length()==n){
        boolean flag=true;
        for(int j=0;j<m;j++){
          flag=flag&&(str.charAt(s[j]-1)==c[j]+'0');
        }
        if(flag){
          System.out.println(i);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}
