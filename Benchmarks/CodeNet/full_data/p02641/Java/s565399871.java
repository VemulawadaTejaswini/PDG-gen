import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> li = new ArrayList <Integer>();
    ArrayList <Integer> liu = new ArrayList <Integer>();
    ArrayList <Integer> lir = new ArrayList <Integer>();
    int x = sc.nextInt();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      li.add(a);
    }
    Collections.sort(li);
    int l=0;
    int k=0;
    int m=0;
    if(li.size() == 0){
      System.out.println(x);
      System.exit(0);
    }
    liu.add(li.get(0) - 2);
    for(int i=0;i<n;i++){
      if(li.get(i)<x){
        liu.add(li.get(i));
      }else if(li.get(i)>x){
        lir.add(li.get(i));
      }else{
        l++;
      }
    }
    lir.add(li.get(n-1) + 2);
    int under = 0;
    int upper = 0;
    for(int i=1;i<liu.size()+1;i++){
        if(x-i>liu.get(liu.size()-i)){
          k++;
          under=x-i;
          break;
        }
      }
    if(k==0){
        under=liu.get(0)-1;
      }
      for(int i=1;i<lir.size()+1;i++){
        if(x+i<lir.get(i-1)){
          m++;
          upper=x+i;
          break;
        }
      }
      if(m==0){
        upper=liu.get(liu.size()-1)+1;
      }
    if(l==0){
      System.out.println(x);
    }else if(x-under<upper-x){
        System.out.println(under);
      }else if(x-under>upper-x){
        System.out.println(upper);
      }else{
        System.out.println(under);
      }
           
  }
}
   
