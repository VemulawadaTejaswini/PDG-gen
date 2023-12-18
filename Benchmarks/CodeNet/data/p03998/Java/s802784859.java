import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sca = new Scanner(System.in);
    char[] sa = sca.next().toCharArray();
    char[] sb = sca.next().toCharArray();
    char[] sc = sca.next().toCharArray();
    sca.close();
    int la = sa.length;
    int lb = sb.length;
    int lc = sc.length;
    int na = 0;
    int nb = 0;
    int nc = 0;
    char nex = 'a';
    while(true){
      if (nex =='a'){
        if (na==la){
          System.out.println("A");
          break;
        }
        nex = sa[na++];
      }else if (nex =='b'){
        if (nb==lb){
          System.out.println("B");
          break;
        }
        nex = sb[nb++];
      }else{
        if (nc==lc){
          System.out.println("C");
          break;
        }
        nex = sc[nc++];
      }
    }
  }
}