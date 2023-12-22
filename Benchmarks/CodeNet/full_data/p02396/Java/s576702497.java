import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    int i=0;
    while(1==1){
      a.add(sc.nextInt());
      if(a.get(i)==0) break;
      i++;
    };
    for(int j=0;j<i;j++){
      System.out.println("Case "+j+1+": "+a.get(j));
    }
  }
}

