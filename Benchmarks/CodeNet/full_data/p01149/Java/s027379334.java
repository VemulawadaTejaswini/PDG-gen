public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, sum, hasa;
    String s;
    char c;
    char[] d;
    d = new char[8];
    for(n = sc.nextInt();n-- > 0;){
      sum = 0; hasa = 0;
      for(i = 0;i < 2;i++){
        s = sc.next(); c = s.charAt(0);
        if(c >= '2' && c <= '9')sum += (int)(c - '0');
        else if(c == 'A'){ sum += 11; hasa++; }
        else sum += 10;
      }
      for(i = 0;i < 8;i++){ s = sc.next(); d[i] = s.charAt(0); }

      if(sum == 21)out.println("blackjack");
      else{
        if(sum == 22){ sum -= 10; hasa--; }
        for(i = 0;i < 8;i++){
          if(sum > 17 || (sum == 17 && hasa == 0)){
            out.println(sum); break;
          }else{
            if(d[i] >= '2' && d[i] <= '9')sum += (int)(d[i] - '0');
            else if(d[i] == 'A'){ sum += 11; hasa++; }
            else sum += 10;
            if(sum > 21 && hasa > 0){
              sum -= 10; hasa--;
            }else if(sum > 21){
              out.println("bust"); break;
            }
          }
        }
        if(i == 8)out.println(sum);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}