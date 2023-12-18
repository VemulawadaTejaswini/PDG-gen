import java.io.*;

class Main {

  public static void main(String[] args) throws Exception {

    BufferedReader strNum = new BufferedReader(new InputStreamReader(System.in));

    try {

      String tmp = strNum.readLine();
      String[] inputNum = tmp.split(" ", 2);

      int inputN = Integer.parseInt(inputNum[0]);
      int inputM = Integer.parseInt(inputNum[1]);

      userOperation(inputN, inputM);

    } catch(Exception e) {
      System.err.println("hoge");
    }
  }

  public static void userOperation(int n, int m) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    String[] numArray = str.split(" ", 0);

    int[] num = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = Integer.parseInt(numArray[i]);
    }

    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n - (i+1); j++) {

          if (num[j] < num[j+1]) {
            int tmp = num[j];
            num[j] = num[j+1];
            num[j+1] = tmp;
          }

        }

    }

    int ans = 0;
    for (int i = 0; i < m; i++) {
      ans += num[i];
    }

    System.out.println(ans);

  }
}