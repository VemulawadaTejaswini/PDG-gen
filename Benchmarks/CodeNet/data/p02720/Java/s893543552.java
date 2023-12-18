import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  static final int DIV = 1;
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();
    final int input = Integer.parseInt(in);
    List<Long> arr = new ArrayList<>(input);
    int base = 2;
    for (long i = 1; i < 10; i++) {
      arr.add(i);
    }
    int size = 0;
    while (arr.size() < input) {
      long prev = arr.get(size);
      coutNumb(prev, input, arr);
      size++;
    }
    System.out.println(arr.get(input -1 ));
  }

  private static void coutNumb(long prev, int input, List<Long> arr) {
    long lastNumb = prev % 10;
    if(lastNumb > 0 && lastNumb < 9){
      addToArr(lastNumb -1, lastNumb+1, prev, arr, input);
    }else if(lastNumb == 0){
      addToArr(0, 1, prev, arr, input);
    }else if(lastNumb == 9){
      addToArr(8, 9, prev, arr, input);
    }
  }

  private static void addToArr(long i, long i1,long prev, List<Long> arr, int input) {
    long next = prev * 10;
    for(long j = i; j <= i1; j++) {
      arr.add(next + j);
      if(arr.size() > input) break;
    }
  }
}
