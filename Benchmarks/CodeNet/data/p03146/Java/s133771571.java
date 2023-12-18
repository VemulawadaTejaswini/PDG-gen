import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    List<Integer> a=new ArrayList<>();
    int i=sc.nextInt();
    a.add(i);
    boolean flg=true;
    while(flg){
      i++;
      if(i%2==0){
        a.add(i/2);
      }else{
        a.add(3*i+1);
      }
      for(int j:a){
        if(j==i){
          flg=false;
        }
      }
    }
    System.out.println(i+1);
  }
}