import java.io.*;
import java.util.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      int k = Integer.parseInt(br.readLine().split(" ")[1]);
      char[] s = br.readLine().toCharArray();
      int happiness = getHappiness(getContinuous(s), k);
      System.out.println(happiness);
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public static int[] getContinuous(char[] s) {
    int[] array = new int[s.length];
    int start = 0;
    for(int i = 0; i < s.length; i++) {
      start++;
      if(i == s.length - 1 || s[i] != s[i + 1]){
        array[i - start + 1] = start;
        start = 0;
      }   
    }
    return array;
  }

  public static int getHappiness(int[] array, int k) {
    int[] maxCont = {0, 0};
    int ele1 = 0;
    int ele2 = 0;
    int ele3 = 0;
    for(int i = 0; i < k; i++) {
      for(int j = 0; j < array.length; j += ele1) {
        ele1 = array[j];
        ele2 = array[j + ele1];
        if(j + ele1 + ele2 >= array.length) {
          break;
        } else {
          ele3 = array[j + ele1 + ele2];
          if(ele1 + ele2 + ele3 > maxCont[1]) {
            maxCont[0] = j;
            maxCont[1] = ele1 + ele2 + ele3;
          }
        }
      }
      for(int m = maxCont[0]; m < maxCont[0] + maxCont[1]; m++) {
        if(m == maxCont[0]) {
          array[m] = maxCont[1];
        } else {
          array[m] = 0;
        }
      }
    }
    int happiness = 0;
    for(int i = 0; i < array.length; i += array[i]) {
      happiness += array[i] - 1;
    }
    return happiness;
  }

  public static void loopPrint(int[] array) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < array.length; i++) {
      if(i != 0) {
        sb.append(", ");
      }
      sb.append(array[i]);
    }
    System.out.println(sb);
  }
}