import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] array = input.readLine().split(" ");
        int[] array1 = Stream.of(array).mapToInt(Integer::parseInt).toArray();
        int disx = Math.abs(array1[2] - array1[0]);
        int disy = Math.abs(array1[3] - array1[1]);
        String ans = "";
        StringBuffer sb = new StringBuffer(ans);
        for(int i=0;i<disy;i++){
            sb.append("U");
        }
        for(int i=0;i<disx;i++){
            sb.append("R");
        }
        for(int i=0;i<disy;i++){
            sb.append("D");
        }
        for(int i=0;i<disx;i++){
            sb.append("L");
        }
        sb.append("LU");
        for(int i=0;i<disy;i++){
            sb.append("U");
        }
        for(int i=0;i<disx;i++){
            sb.append("R");
        }
        sb.append("RDRD");
        for(int i=0;i<disy;i++){
            sb.append("D");
        }
        for(int i=0;i<disx;i++){
            sb.append("L");
        }
        sb.append("LU");
        
        System.out.println(new String(sb));

    }

}