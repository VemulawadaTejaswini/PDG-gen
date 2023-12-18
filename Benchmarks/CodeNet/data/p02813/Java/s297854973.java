public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String n = scan.nextLine();
    String p = scan.nextLine();
    String q = scan.nextLine();

    List<Integer> pArray = Arrays.stream(p.split(" ")).map(Integer::valueOf)
        .collect(Collectors.toList());
    List<Integer> qArray = Arrays.stream(q.split(" ")).map(Integer::valueOf)
        .collect(Collectors.toList());

    int pans = 0;
    List<Integer> tmpLIst = new ArrayList<>();
    while (!pArray.isEmpty()) {
      tmpLIst.clear();
      tmpLIst.addAll(pArray);
      pans = pans + calc(tmpLIst);
      pArray.remove(0);
    }

    int qans = 0;
    while (!qArray.isEmpty()) {
      tmpLIst.clear();
      tmpLIst.addAll(qArray);
      qans = qans + calc(tmpLIst);
      qArray.remove(0);
    }
    System.out.println(pans >= qans ? pans - qans : qans - pans);
    scan.close();
  }

  static int calc(List<Integer> list) {

    if (list.size() == 1) {
      return 1;
    }

    int base = list.get(0);
    Collections.sort(list);
    int index = list.indexOf(base);

    int f = 1;
    for (int i = 1; i < list.size(); i++) {
      f = f * i;
    }
    return index * f;
  }
}