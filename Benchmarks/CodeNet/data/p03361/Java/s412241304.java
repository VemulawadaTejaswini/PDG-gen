import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //孤立した黒マスがなければ塗ることができる
    int H = sc.nextInt();
    int W = sc.nextInt();
    String grid[][] = new String[H+2][W+2];
    String answer="Yes";
    boolean flg = false;
    for(int i=0;i<W+2;i++){
    grid[0][i]=".";
    grid[H+1][i]=".";
    }
    for(int i=0;i<H+2;i++){
    grid[i][0]=".";
    grid[i][W+1]=".";
    }
    String tmp ="";
    for(int i=1;i<H+1;i++){
      tmp = sc.next();
      for(int j=1;j<W+1;j++){
        grid[i][j]=tmp.substring(j-1,j);
      }
    }
    //(2,2)～(H+1,W+1)のすべてのマスについて、
    //自分が#のとき、上下左右すべてが.だったらアウト
    //判定を繰り返し行う。
    for(int i=1;i<H+1;i++){
      for(int j=1;j<W+1;j++){
        if(grid[i][j].equals("#")&&
           grid[i][j-1].equals(".")&&
           grid[i][j+1].equals(".")&&
           grid[i-1][j].equals(".")&&
           grid[i+1][j].equals(".")){
          answer="No";
          flg=true;
          break;
        }
      }
      if(flg){
        break;
      }
    }
    System.out.println(answer);
        
    

    
    
  }
  
  //最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}


//素数判定
static boolean isPrime (int n) {
	if (n==2) return true;
	if (n<2 || n%2==0) return false;
	double d = Math.sqrt(n);
	for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
	return true;
}


//倍数判定（10進数以外のときに有用）
static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {return true;}
	return false;
}


//階乗
static long factorial (int i) {
	if (i==1) {return 1;}
	else {return i*factorial(i-1);}
}


//進数変換
static String toNbase (String sm, int m, int n) {
	return Long.toString(Long.parseLong(sm,m),n);
}
  
}