public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String str;
    char[] ch, ch2;
    int i, j, k, l, n, m, o;

    n = sc.nextInt(); str = sc.nextLine();
    for(;n-- > 0;){
      str = sc.nextLine(); m = str.length();
      ch = new char[m]; ch2 = new char[m];
      for(i = 0;i < m;i++){
        ch[i] = str.charAt(i); ch2[i] = ch[i];
      }

      o = 0;
      for(k = 1;k < 10000;k++){
        if(iscoprime(k, 26)){
          l = inv(k, 26);

          for(i = 0;i < 26;i++){
            for(j = 0;j < m;j++){
              if(ch[j] >= 'a' && ch[j] <= 'z'){
                ch2[j] = (char)(ch[j] - 'a' + 26 - i);
                ch2[j] %= 26;
                ch2[j] = (char)((ch2[j] * l) % 26);
                ch2[j] += 'a';
              }
            }

            for(j = 0;j < m - 3;j++){
              if(ch2[j] == 't' && ch2[j + 1] == 'h'
              && ch2[j + 2] == 'a' && ch2[j + 3] == 't'){
                o = 1; break;
              }else if(ch2[j] == 't' && ch2[j + 1] == 'h'
              && ch2[j + 2] == 'i' && ch2[j + 3] == 's'){
                o = 1; break;
              }
            }
            if(o == 1)break;
          }
        }
        if(o == 1)break;
      }

      for(j = 0;j < m;j++)out.print(ch2[j]);
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean iscoprime(int a, int b){
    int i;
    if(a == 1)return true;
    for(i = 2;i < a + 1;i++)if(a % i == 0 && b % i == 0)return false;
    return true;
  }
  private static int inv(int a, int b){
    int i;
    for(i = 1;i < b;i++)if((a * i) % b == 1)return i;
    return -1;
  }
}