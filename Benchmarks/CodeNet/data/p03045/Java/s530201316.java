package abc126.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int numOfCard = Integer.parseInt(line1[0]);
    int numOfHint = Integer.parseInt(line1[1]);
    List<Set<Integer>> integerSetList = new ArrayList<>();
    
    int x;
    int y;
    boolean notFound;
    String[] data;
    for(int i=0; i<numOfHint; i++){
      notFound = true;
      data = br.readLine().split(" ");
      x = Integer.parseInt(data[0]);
      y = Integer.parseInt(data[1]);
      if(i==0){
        integerSetList.add(new HashSet<>());
        integerSetList.get(0).add(x);
        integerSetList.get(0).add(y);
      }else{
        for (Set<Integer> integer : integerSetList) {
          if (integer.contains(x) || integer.contains(y)) {
            integer.add(x);
            integer.add(y);
            notFound = false;
            break;
          }
        }
        if(notFound){
          Set<Integer> newSet = new HashSet<>();
          newSet.add(x);
          newSet.add(y);
          integerSetList.add(newSet);
        }
      }
    }
    int hinted = 0;
    for(Set<Integer> set: integerSetList){
      hinted += set.size();
    }
    int numOfSeries = integerSetList.size();
    
    System.out.println(numOfCard - hinted + numOfSeries);
  }
}
