import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),a= sc.nextInt(),b= sc.nextInt(),c= sc.nextInt();
    sc.nextLine();
    String str[]=new String[n];
    String s[]=new String[n];
    for(int i=0;i<n;i++){
      str[i]=sc.nextLine();
    }
    if(search(n-1,0,a,b,c,s,str)){
      pl("Yes");
      for(String ss:s){
        pl(ss);
      }
    }else{
      pl("No");
    }

  }

  public static boolean search(int n,int now,int a,int b,int c,String s[],String str[]){
    if(str[now].equals("AB")){
      s[now]="A";
      if(b!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a+1,b-1,c,s,str)){
            return true;
          }
        }
      }
      s[now]="B";
      if(a!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a-1,b+1,c,s,str)){
            return true;
          }
        }
      }
    }else if(str[now].equals("BC")){
      s[now]="B";
      if(c!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a,b+1,c-1,s,str)){
            return true;
          }
        }
      }
      s[now]="C";
      if(b!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a,b-1,c+1,s,str)){
            return true;
          }
        }
      }
    }else{
      s[now]="A";
      if(c!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a+1,b,c-1,s,str)){
            return true;
          }
        }
      }
      s[now]="C";
      if(a!=0){
        if(n==now){
          return true;
        }else{
          if(search(n,now+1,a-1,b,c-1,s,str)){
            return true;
          }
        }
      }
    }
    return false;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
