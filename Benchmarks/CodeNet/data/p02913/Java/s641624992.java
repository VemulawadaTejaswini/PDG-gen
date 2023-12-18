import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 文字列長
        String s = sc.next(); // 文字列

        int result =0;
        loop:
        for(int i = N/2; i>0;i--) { // 切り出す文字列の長さ
            for(int j=0;j+i+i<=N;j++) {  // 前半の開始位置
                for(int l=i+j; i+l<N; l++) { // 後半の開始位置
                    String zenhan = s.substring(j, j+i);
                    String searchRange =s.substring(j+i);
                    if(searchRange.contains(zenhan)) {
                        result = i;
                        break loop;
                    }
                }
            }
        }
        
        
        System.out.println(result);
                
    }

}
