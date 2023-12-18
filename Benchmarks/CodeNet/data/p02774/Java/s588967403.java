import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = input.readLine().split(" "); 
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int count = 0;
        String[] an = input.readLine().split(" ");
        long[] na = Stream.of(an).mapToLong(Long::parseLong).toArray();
        long[] cul = new long[(na.length * (na.length - 1))/2];
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n ; j++){
                cul[count] = na[i] * na[j];
                count++;
                
            }
        }
        Arrays.parallelSort(cul);
        System.out.println(cul[k-1]);

        }

    }