public class Main{
  public static void main(String args[]){

  int i, o;

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  i = Integer.parseInt(br.readline());

  o = i*i*i;
  System.out.println(o);
  }
}