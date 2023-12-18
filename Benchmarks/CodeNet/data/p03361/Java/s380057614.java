import java.util.Scanner;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String S[] = new String[H];
    char s[][] = new char[H][W];
    for(int i=0; i<H; i++){
      S[i] = sc.next();
      s[i] = S[i].toCharArray();
    }
    String ans = "Yes";
    boolean flag = false;
    for(int i=0; i<H; i++){
      if(flag == true) break;
      for(int j=0; j<W; j++){
        if(flag == true) break;
        if(s[i][j] == '#'){
          if(i > 0 && s[i-1][j] == '#') continue;
          if(i < H-1 && s[i+1][j] == '#') continue;
          if(j > 0 && s[i][j-1] == '#') continue;
          if(j < W-1 && s[i][j+1] == '#') continue;
          ans = "No";
          flag = true;
        }
      }
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}
