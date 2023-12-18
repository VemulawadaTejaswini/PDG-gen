import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String n[] = new String[3];
      for(int i=0;i<3;i++){
        n[i]=Integer.parseInt(sc.next());
      }
      if(n[0]+n[1]==n[2]||n[0]+n[2]==n[1]||n[1]+n[2]==n[0]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
