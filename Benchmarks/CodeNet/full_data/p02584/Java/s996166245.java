import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = stdin.readLine()) == null);
        var parsed = line.split(" ");
        Long X = Long.valueOf(parsed[0]);
        Long K = Long.valueOf(parsed[1]);
        Long D = Long.valueOf(parsed[2]);
        
        var sho = Math.abs(X) / D; // まず取りきる回数

        
        var joyo = Math.abs(X) % D; // 半端数
        var sign = X >= 0 ? 1 : -1; //初期場所の符号
        var maybemin = sign * joyo; // 最小値候補。半端数は符号を無視したので符号を戻してやる
        
                // とりきれなければ分かりやすい
        if (sho > K) {
            System.out.println(X - sign * D);
            return;
        }
        
        if (K - sho %2 == 0) { // 残り回数が偶数ならそのまま出す
            System.out.println(maybemin);
        } else {
            // 奇数なら最小値候補の符号と逆に動かす。最小値候補
            System.out.println(maybemin + sign * D);
        }
    } catch(Exception e) {
    }
   
  }
}