import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        List<City> citys  = new ArrayList<>();
        City param = new City();
        for(int i = 0 ; i < m ; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            param.setPref(p[i]);
            param.setYear(y[i]);
            citys.add(param);
        }
        Collections.sort(citys, new TestComparator());
        int[] prefectureArray = new int[100001];
        Map<Integer, Integer> cityIndexMap = new HashMap<>();
        for (int i = 0 ; i < m ; i++ ) {
            prefectureArray[citys.get(i).getPref()]++;
            cityIndexMap.put(citys.get(i).getYear(), prefectureArray[citys.get(i).getPref()]);
        }
        for (int i = 0 ; i < m ; i++) {
            System.out.print(String.format("%06d", p[i]));
            System.out.print(String.format("%06d", cityIndexMap.get(y[i])));
            System.out.println("");
        }
    }

}

//複数キーのソート
class City {
  private int year;
  private int pref;
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public int getPref() {
    return pref;
}
public void setPref(int pref) {
    this.pref = pref;
}


}

class TestComparator implements Comparator<City> {
  @Override
  public int compare(City o1, City o2) {
      return o1.getYear() - o2.getYear();
  }

}