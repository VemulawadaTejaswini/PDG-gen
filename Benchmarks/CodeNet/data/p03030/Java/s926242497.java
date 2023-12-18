import java.util.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S[] = new String[N];
    Integer P[] = new Integer[N]; 
    for(int i=0; i<N; i++){
      S[i] = sc.next();
      P[i] = sc.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0,0);
    for(int i=1; i<N; i++){
      int j = 0;
      while(true){
        if(j == list.size()){
          list.add(j, i);
          break;
        }else{
          if(S[i].compareTo(S[list.get(j)]) < 0){
            list.add(j, i);
            break;
          }else if(S[i].compareTo(S[list.get(j)]) == 0){
            if(P[i] > P[list.get(j)]){
              list.add(j, i);
              break;
            }else{
              j++;
              continue;
            }
          }else{
            j++;
            continue;
          }
        }
      }
    }
    for(int a: list){
      System.out.println(a+1);
    }
  }
    

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}