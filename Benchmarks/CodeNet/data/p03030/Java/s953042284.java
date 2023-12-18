import java.util.*;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);


  private void run() {
    int N = Integer.parseInt(sc.next());
    List<GuideBook> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(new GuideBook(i + 1, sc.next(), Integer.parseInt(sc.next())));
    }
    Comparator<GuideBook> rComparetor = Comparator.comparing(GuideBook::getRestaulant);
    Comparator<GuideBook> pComparetor = Comparator.comparingInt(GuideBook::getPoint).reversed();
    Comparator<GuideBook> comparator = rComparetor.thenComparing(pComparetor);

    list.sort(comparator);

    for (GuideBook guideBook : list) {
      System.out.println(guideBook.getId());
    }
  }
}

class GuideBook {
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRestaulant() {
    return restaulant;
  }

  public void setRestaulant(String restaulant) {
    this.restaulant = restaulant;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public GuideBook(int id, String restaulant, int point) {
    this.id = id;
    this.restaulant = restaulant;
    this.point = point;
  }

  int id;
  String restaulant;
  int point;
}
