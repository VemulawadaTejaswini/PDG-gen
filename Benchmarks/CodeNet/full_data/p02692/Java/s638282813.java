import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] lines = br.readLine().split(" ");
    int n = Integer.parseInt(lines[0]);
    int[] abc = new int[4];
    abc[1] = Integer.parseInt(lines[1]);  //A
    abc[2] = Integer.parseInt(lines[2]);  //B
    abc[3] = Integer.parseInt(lines[3]);  //C
    String mark = "_ABC";
    char[] history = new char[n];
    int[] commands = new int[n];
    for (int i = 0; i < n; i++) {
      String command = br.readLine();
      if ("AB".equals(command)) {
        commands[i] = 12;
      } else if ("AC".equals(command)) {
        commands[i] = 13;
      } else if ("BC".equals(command)) {
        commands[i] = 23;
      }
    }
    br.close();
    for(int i = 0; i < n; i++){
      int command = commands[i];
      int idx_1 = command / 10;
      int idx_2 = command % 10;

      if(abc[idx_1] == 0 && abc[idx_2] == 0){
        System.out.println("No");
        return;
      }
      if(abc[idx_1] == 0){
        abc[idx_1]++;
        abc[idx_2]--;
        history[i] = mark.charAt(idx_1);
      } else if(abc[idx_2] == 0){
        abc[idx_1]--;
        abc[idx_2]++;
        history[i] = mark.charAt(idx_2);
      } else if(abc[idx_1] == 1 && abc[idx_2] == 1){
        if(i + 1 < n && (commands[i + 1] % 10 == idx_1 || commands[i + 1] / 10 == idx_1)){
          abc[idx_1]++;
          abc[idx_2]--;
          history[i] = mark.charAt(idx_1);
        } else {
          abc[idx_1]--;
          abc[idx_2]++;
          history[i] = mark.charAt(idx_2);
        }
      } else {
        if(abc[idx_1] > abc[idx_2]){
          abc[idx_1]--;
          abc[idx_2]++;
          history[i] = mark.charAt(idx_2);
        } else {
          abc[idx_1]++;
          abc[idx_2]--;
          history[i] = mark.charAt(idx_1);
        }
      }
    }

    PrintWriter pw = new PrintWriter(System.out);
    pw.println("Yes");
    for(int i = 0; i < n; i++){
      pw.println(history[i]);
    }
    pw.flush();
  }
}