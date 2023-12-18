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

    if(tChar[0] == sChar[0]){
      count++;
    }

    for(int i = 0; i < tChar.length ; i++){
      // System.out.println("index: i " + i + ", Alphabet:" + tChar[i] + ", Count:" + count);
      Alphabet a = map.get(tChar[i]) ;
      if(a == null){
        count = -1;
        break;
      }
      int nextIndex = a.nextIndex(position);
      if(nextIndex < position){
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
      // 配列barに値をコピー
      System.arraycopy(a, 0, tmp, 0, a.length);

      tmp[a.length] = index;
    }

    public int nextIndex(int index){
      for(int i = 0; i < a.length; i++){
        if(a[i] > index){
          return a[i];
        }
      }
      return a[0];
    }
  }
}
