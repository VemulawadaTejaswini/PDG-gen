import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      List<Integer> list = new ArrayList<>();
      for(int i = 0;i < 3;i++){
        int n = sc.nextInt();
        if(!list.contains(n))
          list.add(n);
      }
      System.out.println(list.size());
    }
}