import java.io.*;
import java.util.function.*;
import java.util.stream.*;
 
class Wandbox
{
    /**
     * ABC 062 B: Picture Frame
     *     (周囲1ピクセルを'#'で囲む)
     */ 
    public static void main(String[] args) throws IOException
    {
        // 入力
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int[] HW = Stream.of(br.readLine().split(" ")).mapToInt(
                item -> new Integer(item)).toArray();
        Stream<String> as = br.lines().filter(item -> item.indexOf(" ") < 0);
 
        // 枠線を入れる
        // Streamは同じインスタンスで2度処理を実行できないため、Supplierを通す
        Supplier<Stream<String>> frame = () ->
                Stream.of(new String(new char[HW[1]]).replace("\0", "#"));
        Stream<String> out = Stream.concat(frame.get(), Stream.concat(as, frame.get())).map(
                item -> "#" + item + "#") ;        
 
        // 出力
        System.out.println(out.collect(Collectors.joining("\n")));
    }
}