public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] count;
    int a, i, j, k;
    char[] ch;
    String str;

    count = new int[13];
    for(;sc.hasNext();){
      str = sc.next();
      ch = new char[str.length()];
      for(j = 0;j < str.length();j++)ch[j] = str.charAt(j);
      a = 0; k = 0;
      for(i = 0;i < 13;i++)count[i] = 0;

      j = 0;
      for(i = 0;i < 4;i++){
        for(;j < str.length();j++){
          if(ch[j] == ','){
            a = readint(ch, k, j);
            count[(a + 11) % 13]++;
            k = ++j; break;
          }
        }
      }
      a = readint(ch, k, str.length());
      count[(a + 11) % 13]++;

      a = 0;
      for(i = 0;i < 13;i++){
        if(count[i] == 4){
          out.println("four card"); a = -1; break;
        }else if(count[i] == 3){
          for(j = 0;j < 13;j++){
            if(count[j] == 2){
              out.println("full house"); a = -1; break;
            }
          }
          if(a != -1){
            out.println("three card"); a = -1;
          }
        }else if(count[i] == 2){
          for(j = 0;j < 13;j++){
            if(count[j] == 2 && j != i){
              out.println("two pair"); a = -1; break;
            }else if(count[j] == 3){
              out.println("full house"); a = -1; break;
            }
          }
          if(a != -1){
            out.println("one pair"); a = -1;
          }
        }else if(count[i] == 1){
          if(i < 9 && count[i + 1] == 1 && count[i + 2] == 1
           && count[i + 3] == 1 && count[i + 4] == 1){
             out.println("straight"); a = -1;
          }
        }
        if(a == -1)break;
      }
      if(a == 0)out.println("null");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res;
    d = 1; res = 0;
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res;
  }
}