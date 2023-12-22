public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str;
    char[] ch;
    int i, n, m;
    int[] count;
    char c;

    count = new int[26];

    for(;sc.hasNextLine();){
      str = sc.nextLine();
      m = str.length();
      ch = new char[m];
      for(i = 0;i < m;i++){
        ch[i] = str.charAt(i);
        if(ch[i] >= 'a' && ch[i] <= 'z'){
          ch[i] -= 'a' - 'A';
        }
        if(ch[i] >= 'A' && ch[i] <= 'Z'){
          count[ch[i] - 'A']++;
        }
      }

    }

    for(i = 0;i < 26;i++){
      c = (char)('a' + i);
      System.out.println(c + " : " + count[i]);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}