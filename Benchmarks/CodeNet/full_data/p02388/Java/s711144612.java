public class Main{
  public static void main(String[] args){
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String str = br.readLine();
    int i = Integer.parseInt(str);
    int j = i * i;
    System.out.println("" + j);
  
      }
    }