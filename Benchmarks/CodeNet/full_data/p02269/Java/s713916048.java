import java.util.Scanner;

class Main{
  static final int M = 1046527;

  static long getKey(String str){
    long key = 0;
    int p = 1;
    for(int i = 0; i < str.length(); i++){
      switch(str.charAt(i)){
        case 'A' : {key += (1 * p);} break;
        case 'C' : {key += (2 * p);} break;
        case 'G' : {key += (3 * p);} break;
        case 'T' : {key += (4 * p);} break;
      }
      p *= 5;
    }
    return key;
  }

  static int h1(long key){
    return (int)(key % M);
  }

  static int h2(long key){
    return (int)(1 + (key % (M - 1)));
  }

  static int h(String str, int i){
    return (h1(getKey(str)) + i * h2(getKey(str))) % M;
  }

  static void insert(String[] s, String str){
    int i = 0;
    while(true){
      int j = h(str, i);
      if(s[j] == null){
        s[j] = str;
        return;
      }
      else
        i++;
    }
  }

  static boolean find(String[] s, String str){
    int i = 0;
    while(true){
      int j = h(str, i);
      if(s[j] == null || i > M)
        return false;
      else if(s[j].equals(str))
        return true;
      else
        i++;
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String[] s = new String[M];

    int n = stdIn.nextInt();
    boolean[] ans = new boolean[n];
    int find_count = 0;

    for(int i = 0; i < n; i++){
      String order = stdIn.next();
      String str = stdIn.next();
      if(order.charAt(0) == 'i')
        insert(s, str);
      else{
        ans[find_count++] = find(s, str);
      }
    }

    for(int i = 0; i < find_count ; i++){
      if(ans[i])
        System.out.println("yes");
      else
        System.out.println("no");
    }

  }
}