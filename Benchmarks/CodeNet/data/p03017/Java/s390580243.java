import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    int d = stdIn.nextInt();
    a = a-1;
    b = b-1;
    c = c-1;
    d = d-1;
    String s = stdIn.next();
    int l = s.length();
    char[] e = new char[l];
    for(int i = 0;i<e.length;i++) {
      e[i] = s.charAt(i);
    }
    int k = 0;
    int t = 0;
    int count1 = 0;
    int count2 = 0;
    long save = 10000000;
    saiki(a,e,c,save,k,count1);
    saiki(b,e,d,save,t,count2);
    if(k==1&&t==1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
    static void saiki(int a,char[] e,int c,long save,int k,int count) {
      if(a==save) count = 1;
      if(a+1<e.length&&a!=c&&count!=1) {
        if(e[a+1]=='.') {
          if(a+1==c) {save = c;k=1;}
          saiki(a+1,e,c,save,k,count);
        }
      }
      if(a+2<e.length&&a!=c) {
        if(e[a+2]=='.') {
          if(a+2==c) {save = c;k=1;}
          saiki(a+2,e,c,save,k,count);
        }
      }
    }
  }
