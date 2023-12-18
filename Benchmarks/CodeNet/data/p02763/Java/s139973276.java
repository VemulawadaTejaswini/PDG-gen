import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  static int N, Q;
  static String S;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in1 = br.readLine().split(" ");
    N = Integer.parseInt(in1[0]);

    S = br.readLine();

    in1 = br.readLine().split(" ");
    Q = Integer.parseInt(in1[0]);

    //int[] R = Stream.of(in1).mapToInt(Integer::parseInt).toArray();

    StringBuilder t = new StringBuilder(S);

    List< TreeSet<Integer> > charPos = new ArrayList<>();
    for(int i = 0; i < 26; i++){
      charPos.add(new TreeSet<Integer>());
    }

    for(int i = 0; i < N; i++){
      int idx = t.charAt(i) - 'a';
      charPos.get(idx).add(i);
    }

    for(int i = 0; i < 26; i++){
      charPos.get(i).add(N);
    }

    List<Integer> ans = new ArrayList<>();

    for(int q = 0; q < Q; q++){

      in1 = br.readLine().split(" ");

      if(in1[0].equals("1")){
        int i = Integer.parseInt(in1[1]) - 1;
        int idxAft = in1[2].charAt(0) - 'a';
        int idxBfr = t.charAt(i) - 'a';

        charPos.get(idxBfr).remove(i);
        charPos.get(idxAft).add(i);
        t.replace(i, i+1, in1[2]);
        System.out.println(t);
      }else{
        int l = Integer.parseInt(in1[1]) - 1;
        int r = Integer.parseInt(in1[2]) - 1;
        int ret = 0;

        for(int i = 0; i < 26; i++){
          if(charPos.get(i).ceiling(l) <= r){
            ret++;
          }
        }

        ans.add(ret);
      }
    }

    br.close();

    ans.stream().forEach(System.out::println);;
  }
}