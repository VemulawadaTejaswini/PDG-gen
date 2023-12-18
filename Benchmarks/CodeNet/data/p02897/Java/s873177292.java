    import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          int c1 = 0;	//偶数文字
          int c2 = 0;	//奇数文字
          Scanner sc = new Scanner(System.in);
    	  int n = sc.nextInt();
          //判定
          for(int i=1;i<=n;i++) {
           		if (Math.abs(i) % 2 == 0) {
                //偶数文字
                  c1++;
            }
            else {
              	//奇数文字
              	c2++;
           }
          }
           System.out.println(String.format("%.10f", (double)c2/(double)n));
        }
    }