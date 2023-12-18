import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          int x = getInt();
          int y = getInt();
          int mod = 1000000007;
          
          if(x > y){
            int t = y;
            y = x;
            x = t;
          }
          
          if(y > 2 * x){
            myout(0);
       		return;
          }
          if((x+y) % 3 != 0){
            myout(0);
      		return;
          }
	int tmpX = x;
	int tmpY = y;
	//原点に向かうべく、境界線のところ（y = 2x,またはy = x/2の座標）に帰れるか。帰れなかったら0
	int xLineCount = 0;
  int yLineCount = 0;
  while(true){
       tmpX -= 2;
      tmpY -= 1;
    yLineCount++;
      if(tmpY / 2 == tmpX){
         break;
      }else if(tmpX < 1 || tmpY < 1){
               myout(0);
        return;
       }
    }
   tmpX = x;
	 tmpY = y;
	while(true){
       tmpX -= 1;
      tmpY -= 2;
    xLineCount++;
      if(tmpX / 2 == tmpY){
         break;
      }else if(tmpX < 1 || tmpY < 1){
               myout(0);
        return;
       }
    }
          
          
          myout(originComb(xLineCount+yLineCount,xLineCount,mod));
          //myout(groovyPow(x,n,mod));
          //myout(originPow(x,n,mod));
          //myout(Math.pow(x,n));
        }
        //便利メソッド追加枠ここから

static long originComb(int n, int k, int m){
  long[] factrial = new long[n+1];
  long[] inverse = new long[n+1];
  factrial[0] = 1;inverse[0] = 1;
  for(int i = 1; i <= n; i++){
    factrial[i] = (factrial[i-1] * i) % m;
    inverse[i] = originPow(factrial[i], m-2,m) % m;
  }
  return factrial[n] * inverse[k] % m * inverse[n-k] % m;
}
  
static long originPow(long x, int n){
  return originPow(x,n,1000000007);
}
static long originPow(long x, int n,int m) {
	long ans = 1;
	while (n > 0) {
		if ((n & 1) == 1)ans = ans * x % m;
		x = x * x % m;
		n >>= 1;
	}
	return ans;
}

  
        //便利メソッド追加枠ここまで
}
