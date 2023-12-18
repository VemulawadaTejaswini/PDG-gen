import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long count = 1; // (1,1)
        for(int i=2; i<=n; i++) {
            String s = Integer.toString(i);
            int len = s.length();
            int first = Integer.parseInt(s.substring(0, 1));
            int last = Integer.parseInt(s.substring(len-1));
            int mid = 0;
            if(len>2) {
                mid = Integer.parseInt(s.substring(1, len-1));
            }
            if(last == 0) {
                continue;
            }
            if(len<=1) {
                count++; // 1桁の数は必ず組になる
                continue;
            }

            // 2桁以上のとき、同桁数同士の組の数
            long scale = 1;
            if(len>2) {
                scale = (long)Math.pow(10, len-2);
            }
            if(last < first) {
                // ひっくり返したらiより小さい
                // 例：i=32 => (32, 23) * 2
                // 例：i=362 => (362, 203), (362, 213), ... * 2
                count+=2*scale;
            }
            if(last==first) {
                // ゾロ
                // 例：33 => (33, 33) ※ここでは (3, 33), (33, 3) は数えない。下位の桁は後で。
                // 例：323 => (323, 303), (323, 313), (323, 323) * 2 から　(323, 323) の重複組を引く
                count+=(mid+1)*2-1;
            }

            // 2桁以上かつゾロのとき、1桁との組
            if(last==first) {
                count+=2;
            }

            // 3桁以上のとき、下位桁（2桁以上）との組の数
            // ここでは重複は考えなくて良い
            // 例：i=512 => (512, 25) * 2
            // 例：i=1024 => (1024, 41), (1024, 4x1)*10    の2倍
            scale = 1;
            for(int j=0; j<len-2; j++) {
                count += scale * 2;
                scale *= 10;
            }
        }
        System.out.println(count);
    }
}
