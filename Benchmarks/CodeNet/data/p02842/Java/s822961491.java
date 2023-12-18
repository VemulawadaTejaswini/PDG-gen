import java.util.Scanner;
             
            public class Main { //クラス名はMain
                public static void main(String[] args) {
                    //コード
                  Scanner sc = new Scanner(System.in);
                  int n1 = sc.nextInt();
                  int kane = 0;
                  
                  loop: for(int i=1;i<=n1;i++) {
                  kane = (int)(i * 1.08);
                    //等価判定
       				if (n1 == kane) {
              				System.out.println(i);
                      return;
                    }
                }
                  System.out.println(":(");
            }
            }