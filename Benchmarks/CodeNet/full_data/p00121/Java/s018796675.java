import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  private static String ANSWER = "01234567";
  private static int[][] MOVE_LIST = {
      { 1, 4 },
      { 0, 2, 5 },
      { 1, 3, 6 },
      { 2, 7 },
      { 0, 5 },
      { 1, 4, 6 },
      { 2, 5, 7 },
      { 3, 6 }
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String map = br.readLine();
      if (map == null) {
        break;
      }

      int count = breathFirstSearch(removeSpace(map));
      System.out.println(count);
    }
  }

  private static String removeSpace(String map) {
    String[] newMap = map.split(" ");
    return Arrays.asList(newMap).stream().collect(Collectors.joining());
  }

  private static int breathFirstSearch(String inputMap) {
    int count = 0;
    List<String> searchMaps = new ArrayList<>();
    List<String> alreadyWentMaps = new ArrayList<>();
    searchMaps.add(inputMap);

    while(true) {
      List<String> nextSearchMaps = new ArrayList<>();
      for(String map : searchMaps) {
        if (map.equals(ANSWER)) {
          return count;
        }
        if (alreadyWentMaps.contains(map)) {
          continue;
        }

        nextSearchMaps.addAll(getMovedMaps(map));
        alreadyWentMaps.add(map);
      }

      searchMaps = nextSearchMaps;
      count++;
    }
  }

  private static List<String> getMovedMaps(String inputMap) {
    int index = inputMap.indexOf('0');

    List<String> nextMaps = new ArrayList<>();
    for (int nextId : MOVE_LIST[index]) {
      String[] newMap = inputMap.split("");
      newMap[index] = newMap[nextId];
      newMap[nextId] = "0";
      nextMaps.add(Arrays.stream(newMap).collect(Collectors.joining()));
    }

    return nextMaps;
  }
}