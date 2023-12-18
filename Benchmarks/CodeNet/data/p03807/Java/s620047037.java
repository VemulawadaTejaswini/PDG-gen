iimport java.util.*;

class Main{
  public static void main(String[] args){
    //declare
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<Integer>();
    int a,b;
    //imput
    b = 0;
    a = in.nextInt();
    for (int i=0;i<a;i++){
      b += Integer.parseInt(in.next());
    }
    //calculaate
    if(b % 2 == 0){System.out.println("YES");}
    else{System.out.println("NO");}
  }
}