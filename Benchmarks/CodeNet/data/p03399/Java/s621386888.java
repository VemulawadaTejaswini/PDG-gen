import java.util.Scanner;


class TrabelingBudget_0{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] budget = new int[4];
    int usedBudget_train = 0;
    int usedBudget_bus = 0;

    for (int i=0; i<4; i++) {
      budget[i] = sc.nextInt();
    }

    if (budget[0]<budget[1]) {
      usedBudget_train = budget[0];
    }else{
      usedBudget_train = budget[1];
    }

    if (budget[2]<budget[3]) {
      usedBudget_bus = budget[2];
    }else{
      usedBudget_bus = budget[3];
    }

    System.out.println(usedBudget_train + usedBudget_bus);

  }
}
