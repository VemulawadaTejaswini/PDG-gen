//import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    while(!(input1==0&&input2==0)) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int members = 0; members < input1; members++) {
        int input3 = scan.nextInt();
        for(int dates = 0; dates < input3; dates++) {
          int input4 = scan.nextInt();
          if(map.containsKey(input4)) {
            int number = map.get(input4);
            map.remove(input4);
            map.put(input4,number+1);
          }else {
            map.put(input4,1);
          }
        }
      }

      int answerDate = -1;
      int count = -1;
      for(Map.Entry entry : map.entrySet()) {
        int dummyKey = (int)entry.getKey();
        int dummyCount = (int)entry.getValue();

        //System.out.println(entry.toString());

        if(dummyCount > count) {
          answerDate = dummyKey;
          count = dummyCount;
        }
      }
      //System.out.println(answerDate+":"+count+","+input2);

      if(count < input2) answerDate = 0;

      System.out.println(answerDate);

      input1 = scan.nextInt();
      input2 = scan.nextInt();
    }
  }
}