import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    char[] sChar = s.toCharArray();
    Map<Character, Alphabet> map = new HashMap<>();

    // Map生成
    for (int i = 0; i < sChar.length ; i++) {
      Alphabet a = map.get(sChar[i]);
      if (a == null) {
        map.put(sChar[i], new Alphabet(sChar[i], i));
      } else {
        a.addIndex(i);
      }
    }

    char[] tChar = t.toCharArray();

    int position = -1;
    long count = 0;
    int sCharLength = sChar.length;

    for(int i = 0; i < tChar.length ; i++){
      //System.out.print("index: i " + i + ", Alphabet:" + tChar[i] + ", Count:" + count);
      Alphabet a = map.get(tChar[i]) ;
      if(a == null){
        count = -1;
        break;
      }
      //System.out.print(",position" + position);
      int nextIndex = a.nextIndex(position);
      //System.out.println(", nextIndex"+ nextIndex);
      if(nextIndex <= position){
        count += (sCharLength - position) + nextIndex;
      } else {
        count += nextIndex - position;
      }
      position = nextIndex;
    }

    System.out.println(count);
  }

  public static class Alphabet {
    char alphabet;
    int[] a;
    public Alphabet (char c, int index){
      this.alphabet = c;
      int[] tmp = {index};
      this.a = tmp;
    }

    public void addIndex (int index){
      int[] tmp = new int[a.length + 1];
      System.arraycopy(a, 0, tmp, 0, a.length);

      tmp[a.length] = index;
      a = tmp;
    }

    public int nextIndex(int index){
      if(a[a.length - 1] <= index){
        return a[0];
      }
      int pos = -1;
      int lower = 0; // 下限
      int upper = a.length - 1; // 上限
      int mid = 0;

      while (lower <= upper) {

        mid = (lower + upper) / 2;
          if (a[mid] == index) {
            pos = mid;
            break;
          } else if (a[mid] < index) {
            lower = mid + 1;
          } else {
            upper = mid - 1;
          }
       }

      if(mid - 1 >=  0 && a[mid - 1] > index){
        return a[mid - 1];
      } else if (a[mid] > index){
        return a[mid];
      } else{
        return a[mid + 1];
      }
    }
  }
}
