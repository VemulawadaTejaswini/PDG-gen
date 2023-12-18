import java.util.*;
import static java.lang.System.*;

class Guidebook implements Comparable<Guidebook>{
  public String city;
  public int score;
  public int number;
  
  public int compareTo(Guidebook obj){
    if(this.city.equals(obj.city)){
      return obj.score - this.score;
    }else{
      return this.city.compareTo(obj.city);
    }
  }
}

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Guidebook X[] = new Guidebook[N];
    for(int i=0; i<N; i++){
      X[i] = new Guidebook();
      X[i].city = sc.next();
      X[i].score = sc.nextInt();
      X[i].number = i+1;
    }
    Arrays.sort(X);
    for(int i=0; i<N; i++){
      out.println(X[i].number);
    }
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}

