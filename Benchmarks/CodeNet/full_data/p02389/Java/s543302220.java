import static java.lang.System.out;
public class Main {
     public static void main(String[] args){
          String str = new java.util.Scanner(System.in).nextLine();
          String[] tmp = str.split(" ");
          int a = Integer.parseInt(tmp[0]);
          int b = Integer.parseInt(tmp[1]);
          
          int area = a * b;
          int circu = (a + b) * 2;
          out.print(area + " ");                                                                                                           
          out.println(circu);
     }
}