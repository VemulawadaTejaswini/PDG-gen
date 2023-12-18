import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();

    ArrayList<Data> data = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int A = scn.nextInt();
      int B = scn.nextInt();
      data.add(new Data(A, B));
    }

    Collections.sort(data, new DataComparator());

    int expense = 0;
    int drinkCount = 0;
    for (Data d : data) {
      drinkCount += d.stock;
      expense += d.stock * d.price;

      if (drinkCount >= M) {
        int excess = drinkCount - M;
        expense -= excess * d.price;
        break;
      }
    }

    System.out.println(expense);
  }

  public static class Data {
    private int price;
    private int stock;

    Data(int a, int b) {
      this.price = a;
      this.stock = b;
    }

    @Override
    public String toString() {
      return String.valueOf(this.price) + ":" + String.valueOf(this.stock);
    }
  }

  public static class DataComparator implements Comparator<Data> {
    @Override
    public int compare(Data d1, Data d2) {
      return d1.price < d2.price ? -1 : 1;
    }
  }

}
