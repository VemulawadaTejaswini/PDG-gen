import java.util.*;
public class Main(){
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);;
    int i,tmp,pre;
    int n=sc.nextInt();
    int m=sc.nextInt();
    String[] a=new String[n];
    String[] b=new String[m];
    for(i=0;i<n;i++){a[i]=sc.next();}
    for(i=0;i<m;i++){b[i]=sc.next();}
    for(i=0;i<n-m+1;i++){
      for(int j=0;j<n-m+1;j++){
        if(j==0)tmp=0; else tmp=pre;
        tmp=a[i].indexOf(b[i],tmp);
        if(tmp==-1)break;
        pre=tmp;
        if(Main.check(tmp,i,a,b)){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
  public static boolean check(int col,int row,String[] a,String[] b){
    for(int i=1;i<m;i++){
      if(a[row+i].indexOf(b[i],col)!=col)return false;
    }
    return true;
  }
}