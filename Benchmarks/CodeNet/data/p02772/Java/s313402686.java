import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(sc.next());
            if(a%2==0){
              if(a%3!=0 && a%5!=0){
                flag = true;
                //System.out.println(a + "aa");
              }
            }
        }
        if(flag == true)
          System.out.println("DENIED");
        else
          System.out.println("APPROVED");
    }
}
