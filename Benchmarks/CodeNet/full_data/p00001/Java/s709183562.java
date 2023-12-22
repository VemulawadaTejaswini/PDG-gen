public class Main { 
  public static void main(String[] args){
    int[] array = {1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922};
    java.util.Arrays.sort(array);
    for(int i = 9; i > 6; i--) {
      System.out.println(array[i]);
    }
  }
}