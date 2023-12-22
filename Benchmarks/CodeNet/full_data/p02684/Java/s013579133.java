import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long k=sc.nextLong();
    int[] a=new int[n+1];
    for(int i=1;i<=n;i++){
      a[i]=sc.nextInt();
    }
    List<Integer> ls=new ArrayList<>();
    Set<Integer> st=new HashSet<>();
    int p=1;
    ls.add(p);
    st.add(p);
    while(!st.contains(a[p])){
      p=a[p];
      st.add(p);
      ls.add(p);
    }
    int idx=ls.indexOf(a[p]);
    if(k<ls.size()){
      System.out.println(ls.get((int)k));
    }else{
      System.out.println(ls.get((int)((k-idx)%(ls.size()-idx)+idx)));
    }
  }
}