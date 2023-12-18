import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> li = new ArrayList <Integer>();
    ArrayList <Integer> lili = new ArrayList <Integer>();
    for(int i=0;i<9;i++){
      int a = sc.nextInt();
      li.add(a);
    }
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      lili.add(a);
    }
    for(int i=0;i<9;i++){
      for(int k=0;k<n;k++){
        if(li.get(i)==lili.get(k)){
          li.set(i,0);
        }
      }
    }
    if(li.get(0)+li.get(1)+li.get(2)==0
       ||li.get(3)+li.get(4)+li.get(5)==0
       ||li.get(6)+li.get(7)+li.get(8)==0
       ||li.get(0)+li.get(3)+li.get(6)==0
       ||li.get(1)+li.get(4)+li.get(7)==0
       ||li.get(2)+li.get(5)+li.get(8)==0
       ||li.get(0)+li.get(4)+li.get(8)==0
       ||li.get(2)+li.get(4)+li.get(6)==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
