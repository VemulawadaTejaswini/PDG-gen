import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    long multi = 1;
    long max = (long)Math.pow(10.0, 18.0);
    boolean overMax = false;
    for(int i = 0; i < num; i++){
      long tmp = sc.nextLong();
      if(tmp == 0){
      	System.out.println(0);
        return;
      }
      if(!overMax){
        multi = multi * tmp;
        if(max < multi){
          overMax = true;
        }
      }
    }
    
     System.out.println(overMax ? "-1" : multi);
    
  }

}