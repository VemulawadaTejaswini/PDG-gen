public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] count, res;
    char[] ch;
    String str;
    int i, j, k;

    ch = new char[13]; count = new int[9]; res = new int[9];
    for(;sc.hasNext();){
      str = sc.next();
      for(i = 0;i < 9;i++){
        count[i] = 0; res[i] = 0;
      }
      for(i = 0;i < 13;i++){
        ch[i] = str.charAt(i);
        count[ch[i] - '1']++;
      }

      k = 0;
      for(i = 0;i < 9;i++){
        if(count[i] != 4){
          count[i]++;

          for(j = 0;j < 9;j++){
            if(count[j] >= 2){
              count[j] -= 2;
              if(count[j] >= 0 && solve(count, 4)){
                res[k++] = i + 1; count[j] += 2; break;
              }
              count[j] += 2;
            }
          }
          count[i]--;
        }
      }

      for(i = 0;i < k - 1;i++)out.print(res[i] + " ");
      out.println(res[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static boolean solve(int[] count, int t){
    int i, j;
    int[] c2;

    if(t == 0)return true;
    c2 = new int[9];
    for(i = 0;i < 9;i++)c2[i] = count[i];

    for(i = 0;i < 9;i++)if(c2[i] >= 3){
      c2[i] -= 3;
      return solve(c2, t - 1);
    }

    for(i = 0;i < 7;i++){
      if(c2[i] > 0 && c2[i + 1] > 0 && c2[i + 2] > 0){
        c2[i]--; c2[i + 1]--; c2[i + 2]--;
        return solve(c2, t - 1);
      }
    }
    return false;
  }
}