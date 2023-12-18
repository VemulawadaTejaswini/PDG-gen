import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final Object[] Compiler = null;

    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = input.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] array = input.readLine().split(" ");
        List<Long> list =
            Arrays
              .stream(array)
              .map(Long::valueOf)
              .collect(Collectors.toList());;
        long time = 0;
        if(n<=k){
            System.out.println(0);
            return;
        }
        //asList(s);は固定長のlistを返す
        //List<Integer> list = Arrays.asList(hn);

        Collections.sort(list,Collections.reverseOrder());
        if(k>0){
            list.subList(0, k).clear();
        }
        time = list.stream()
                   .mapToLong(Long::longValue)
                   .sum();
        System.out.println(time);

        }

    }
