import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(tokens -> {
                    long h = tokens[0];
                    long w = tokens[1];
                    long all = h * w;
                    if(all%2 == 0){
                      System.out.println(all/2);
                    }else{
                      System.out.println(all/2+1);
                    }
                });
        }
    }
}