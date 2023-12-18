import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int[] kc = new int[100001];
    int[] gc = new int[100001];
    int maxkid = -1;
    int maxgid = -1;
    int maxkn = 0;
    int maxgn = 0;
    for(int i = 0; i < n; i++){
      v[i] = sc.nextInt();
      if((i+1)%2==0){
        kc[v[i]]++;
        if(maxkn < kc[v[i]]){
          maxkn = kc[v[i]];
          maxkid = v[i];
        }
      }else{
        gc[v[i]]++;
        if(maxgn < gc[v[i]]){
          maxgn = gc[v[i]];
          maxgid = v[i];
        }
      }
    }
    int answer = 0;
    for(int i = 0; i < n; i++){
      if((i+1)%2==0){
        if(maxkid != v[i]){
          answer++;
        }
      }else{
        if(maxgid != v[i]){
          answer++;
        }
      }
    }
    if(maxkid != maxgid){
      System.out.print(answer);
    }else{
      System.out.print(n/2);
    }
  }
}
