import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> num = new ArrayList<>();
    boolean isDistinct = false;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      if(!num.contains(tmp)){
        num.add(tmp);
      }else{
        isDistinct = true;
        break;
      }
    }
    if(isDistinct){
    System.out.print("No");
    }else{
      System.out.print("Yes");
    }
    }
}
