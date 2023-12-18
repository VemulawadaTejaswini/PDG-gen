import java.util.*;

class Main{
  static public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(),
    b=sc.nextInt(),c=sc.nextInt();
    if(a<=c&&c<=b)System.out.println("YES");
    else System.out.println("NO");
    sc.close();
  }
}
