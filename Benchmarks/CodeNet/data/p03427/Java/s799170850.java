import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    //buffはsの先頭の数字に、9をつなげた数字になる。例：s=1234 -> buff=1999
    long buff=(Integer.valueOf(s.substring(0, 1))+1)*(long)Math.pow(10, s.length()-1)-1;
    if(Long.valueOf(s)==buff) {
    	 System.out.println(Integer.valueOf(s.substring(0, 1))+9*(s.length()-1));
    }else {
    	System.out.println(Integer.valueOf(s.substring(0, 1))-1+9*(s.length()-1));
    }
  }
}
