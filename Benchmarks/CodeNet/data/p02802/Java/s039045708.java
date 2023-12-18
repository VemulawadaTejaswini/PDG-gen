import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int AC =0;
    int WA =0;

    Map<Integer, List<String>> m = new TreeMap<>();
    for (int i = 0; i < M; i++) {
      int q = sc.nextInt();
      String res = sc.next();

      if(!m.containsKey(q)){
        m.put(q,new ArrayList<String>());
      }
      m.get(q).add(res);
    }


    for (Map.Entry<Integer,List<String>> e :m.entrySet()) {
      int q = e.getKey();

      int waCnt =0;
      int acCnt =0;

      List<String> l = e.getValue();

      for (String res: l){
        if(res.equals("WA")){
          waCnt++;
        }else{
          acCnt++;
          break;
        }
      }
      if(acCnt!=0){
        WA+=waCnt;
        AC+=acCnt;
      }


    }

    System.out.println(AC+" "+WA);

  }
}
