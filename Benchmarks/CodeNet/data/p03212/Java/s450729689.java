import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count = 0;
    String str = String.valueOf(x);
    int[] stg = {3,7,5};

    if(x < 357){
        System.out.println("0");
    }else{
        for(int i = 356;i <= x;i++){
            String s = String.valueOf(i);
            if(s.contains("0") | s.contains("1") | s.contains("2") | s.contains("4") | s.contains("6") | s.contains("8") | s.contains("9")){
            }else if(s.contains("3") & s.contains("5") & s.contains("7")){
                count++;
            }else{
            }
        }
        System.out.println(count);
    }
  }
}