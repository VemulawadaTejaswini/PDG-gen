
public class Main{
  public static void main(String[] argv)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    while((n=Integer.parseInt(br.readLine())) != 0){
      String s=br.readLine();
      while(n-- > 0){
        int count=1,len=s.length();
        String tmp = "";

        for(int i=1;;i++){
          if(i == len){
            tmp += Integer.toString(count) + Character.toString(s.charAt(i-1));
            break;
          }
          if(s.charAt(i) == s.charAt(i-1)){
            count++;
          }
          else{
            tmp += Integer.toString(count) + Character.toString(s.charAt(i-1));
            count = 1;
          }
        }
        s = tmp;
      }
      System.out.println(s);
    }
  }
}