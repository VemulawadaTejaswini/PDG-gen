/* ITP1_9_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int q = Integer.parseInt(br.readLine());

      for(int i = 0; i < q; i++){
        String[] order = br.readLine().split(" ");
        String operation = order[0];
        int a = Integer.parseInt(order[1]);
        int b = Integer.parseInt(order[2]) + 1;
        StringBuilder sb = new StringBuilder();

        switch(operation){
          case "print":
            sb.append(str.substring(a,b));
            System.out.println(sb);
            break;
          case "reverse":
            StringBuilder sub = new StringBuilder(str.substring(a, b));
            sb.append(str);
            sb.replace(a, b, sub.reverse().toString());
            str = sb.toString();
            break;
          case "replace":
            sb.append(str);
            sb.replace(a, b, order[3]);
            str = sb.toString();
            break;
          default:
            break;
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}