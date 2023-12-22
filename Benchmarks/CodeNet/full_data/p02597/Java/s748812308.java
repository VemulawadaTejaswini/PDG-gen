import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
class Main{
  public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      String s=in.next();
      String[] arr=s.split("R+");
      HashSet<Integer> st = new HashSet<Integer>();
      for(String e:arr)
        st.add(e.length());
    Iterator<Integer> it = st.iterator();
    int sm=0;
     while(it.hasNext()){
        sm=sm+it.next();
     }
     System.out.println(sm);
  }
}