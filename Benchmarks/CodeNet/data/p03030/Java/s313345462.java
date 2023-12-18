import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    int[] p=new int[n];
    int[] ans=new int[n];
    for(int i=0;i<n;i++){
      s[i]=sc.next();
      p[i]=sc.nextInt();
      ans[i]=i+1;
    }
    int inttmp;
    String strtmp;
    for(int i=0;i<n;i++){
      for(int j=1;j<n;j++){
        if(s[j-1].compareTo(s[j])>0||(s[j-1].compareTo(s[j])==0&&p[j-1]<p[j])){
          strtmp=s[j-1];
          s[j-1]=s[j];
          s[j]=strtmp;
          inttmp=p[j-1];
          p[j-1]=p[j];
          p[j]=inttmp;
          inttmp=ans[j-1];
          ans[j-1]=ans[j];
          ans[j]=inttmp;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.println(ans[i]);
    }
  }
}
