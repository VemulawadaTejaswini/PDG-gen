import java.util.Scanner;
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int three = N/3;
    int tree[] = new int[N];
    int from, to;
    int ki, gu;
    ki = gu = 0;
    while(sc.hasNext()){
      from = sc.nextInt();
      to = sc.nextInt();
      if(tree[from-1]%2==0){
        tree[to-1] = 1;
        ki++;
      } else {
        tree[to-1] = 2;
        gu++;
      }
    }
    int ans[] = new int[N];
    boolean check[] = new boolean[N];
    int k, l, m;
    k = l = 0;
    m = 1;
    if(three<ki&&three<gu){
      for(int i=0;i<N;i++){
        if(tree[i]==1&&k<three) {
          ans[i]=3*k+1;
          check[ans[i]-1]=true;
          k++;
        }
        else if(tree[i]==2&&l<three){
          ans[i]=3*l+2;
          check[ans[i]-1]=true;
          l++;
        }
      }
    }
    else if(ki<three){
      for(int i=0;i<N;i++){
        if(tree[i]==1) {
            ans[i]=3*m;
            check[ans[i]-1]=true;
            m++;
        }
      }
    }
    else if(gu<three){
      for(int i=0;i<N;i++){
        if(tree[i]==2) {
            ans[i]=3*m;
            check[ans[i]-1]=true;
            m++;
        }
      }
    }
    int c = 0;
    for(int i=0;i<N;i++){
      System.err.print(tree[i]);
      if(ans[i]!=0){
        System.out.print(ans[i]+" ");
      } else {
        while(check[c]){ 
          c++;
        }
        System.out.print((c+1)+" ");
        c++;
      }
    }
  }
}
