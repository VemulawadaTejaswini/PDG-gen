import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long pos[] = new long[m];
    for(int i=0;i<m;++i)pos[i]=sc.nextInt()+sc.nextInt()*n;
    Arrays.sort(pos);
    int ans = 0;
    int brg = -1;
    int index = 0;
    for(int i=1;i<=n;++i){
      while(index<m && pos[index]/n==i){
        if(brg<=pos[index]%n){
          brg=i;++ans;
        }
        ++index;
      }
    }
    System.out.println(ans);
  }
}