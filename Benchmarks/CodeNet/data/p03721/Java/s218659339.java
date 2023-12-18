import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String[] param = scan.nextLine().split(" ");

    int n = Integer.parseInt(param[0]);
    int k = Integer.parseInt(param[1]);

    int minNumb = 0;
    int t = 1;

    for (int i = 0; i < n ; i++){
        String[] elem = scan.nextLine().split(" ");

        int number = Integer.parseInt(elem[0]);
        int multip = Integer.parseInt(elem[1]);

        if (t <= k && t + multip >= k){
            minNumb = number;
        }
        t+= multip;

    }

    System.out.println(minNumb);
  }
}
