import java.util.*;
/*型 変数名[配列サイズ];int day[7]; 
int day[7], value;
day[0] = 3; // 最初の要素を 3 で初期化。
day[1] = 4;
day[2] = 8;
value = day[2]; // 要素2の値をvalueに代入する。value は8になる。
day[0] = 3; // 最初の要素を 3 で初期化。
day[1] = 4;
day[2] = 8;
value = day[2]; // 要素2の値をvalueに代入する。value は8になる。
*/

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        int x;
        int a[] = new int [n];
        
        for(int i = 1; i <= n; i++){
            x=sc.nextInt();
            a[i-1] =x;
        }
        // 
        // 配列の値を出力
//        for(int i = 1; i <= n; i++){
//            System.out.print(a[i-1]);
//        }
            
        for(int i = n-1; 0<=i; i--){

/*int i;
for ( i = 0; i < n; i++ ){
    if ( i ) printf(" "); /* i が1以上のとき、つまり最初の要素ではないとき、空白を出力 */
/*    printf("%d", a[i]);
}
printf("\n");   */
            if(i==0){
             System.out.print(a[i]);        
            }else{
             System.out.print(a[i] + " ");
            }
        }  System.out.println();

    }
}

