import java.util.*;
import java.lang.*;
import java.io.*;


class WandBox{
  public static void main(String[] args) throws IOException {
//     System.out.println("");
//     List<Integer> list = new ArrayList<Integer>();

    // Scanner scanner = new Scanner(System.in);
    BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
    // Integer N = Integer.valueOf(scanner.next());
    Integer N = Integer.valueOf(bs.readLine());
    List<String> S = new ArrayList<String>();
    List<Integer> P = new ArrayList<Integer>();
    List<Restaurant> restaurants = new ArrayList<Restaurant>();

    for(int i = 0; i < N; i++){
      String sp = bs.readLine();
      String[] splitedStr = sp.split(" ", 0);

      restaurants.add(new Restaurant(i + 1, Integer.valueOf(splitedStr[1]), splitedStr[0]));
      // S.add(splitedStr[0]); 
      // P.add(Integer.valueOf(splitedStr[1])); 
    }

    Collections.sort(restaurants, new MyComp());

    for(Restaurant rest : restaurants){
      System.out.println(rest.index);
    }
  }
}

class Restaurant {

  public Integer index;
  public Integer rank;
  public String cityName;

  Restaurant(int index, int rank, String cityName){

    this.rank = Integer.valueOf(rank);
    this.index = Integer.valueOf(index);
    this.cityName = cityName;
  }
  

}

class MyComp implements Comparator<Restaurant>{
  public int compare(Restaurant curr, Restaurant another){
    int cityResult = curr.cityName.compareTo(another.cityName);
    if (cityResult != 0) return cityResult;
    return Integer.compare(another.rank, curr.rank);
  }
}
