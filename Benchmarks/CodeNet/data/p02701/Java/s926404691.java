import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();sc.nextLine();
    int count=0;
    String hashh[]=new String[n];
    for(int i=0;i<n;i++){hashh[i]="";}
    for(int i=0;i<n;i++){
      String str = sc.nextLine();
      int x = hash(str,n);
      if(!hashh[x].equals("")){
        while(true){
          if(str.equals(hashh[x])){
            break;
          }else if(hashh[x].equals("")){
            count++;
            hashh[x]=str;
          }else{
            x=(x+1)%n;
          }
        }
      }else{
        count++;
        hashh[x]=str;
      }
    }
    pl(count+"");
  }
  public static int hash(String str,int n){
    char c[]=str.toCharArray();
    int k=0;
    for(int i=0;i<c.length;i++){
      k+=c[i];
    }
    return k%n;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
