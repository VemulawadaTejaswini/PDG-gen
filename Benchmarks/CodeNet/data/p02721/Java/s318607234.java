import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),k = sc.nextInt(),c = sc.nextInt();sc.nextLine();
    String str = sc.nextLine();
    int syu[]=new int[n];
    for(int i=0;i<n;i++){
      if(str.charAt(i)=='o'){
        syu[i]=1;
      }else{
        syu[i]=0;
      }
    }
    int l1[]=new int[k],l2[]=new int[k];
    int d=0;
    for(int i=0;d<k;i++){
      if(syu[i]==1){
        l1[d]=i;
        d++;
        i+=c;
      }
    }
    d=k-1;
    for(int i=n-1;d>=0;i--){
      if(syu[i]==1){
        l2[d]=i;
        d--;
        i-=c;
      }
    }
    for(int i=0;i<k;i++){
      if(l1[i]==l2[i]){
        pl((l1[i]+1)+"");
      }
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
