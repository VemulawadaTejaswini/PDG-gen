import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    StringBuilder[] a=new StringBuilder[h];
    for(int i=0;i<h;i++){
      String s=sc.next();
      if(s.indexOf('#')==-1){
        i--;
        h--;
      }else{
        a[i]=new StringBuilder(s);
      }
    }
    
    for(int i=0;i<w;i++){
      boolean flag=true;;
      for(int j=0;j<h;j++){
        if(a[j].charAt(i)=='#'){
          flag=false;
          break;
        }
      }
      if(flag){
        for(int j=0;j<h;j++){
          a[j].deleteCharAt(i);
        }
        i--;
        w--;
      }
    }
    
    for(int i=0;i<h;i++){
      System.out.println(a[i]);
    }
  }
}