import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> p= new ArrayList<>();
    for(int i=0;i<n;i++)
      p.add(sc.nextInt());
    List<Integer> st = new ArrayList<>();
    for(int i=0;i<n;i++){
    if(p.get(i)!=i+1){
    st.add(p.get(i)*10+i+1);
    }
    }
    if(st.size()==2 && st.get(0)==(st.get(1)%10*10+st.get(1)/10) || st.size()==0){
      System.out.println("YES");
    }
    else
       System.out.println("NO");
  }
}