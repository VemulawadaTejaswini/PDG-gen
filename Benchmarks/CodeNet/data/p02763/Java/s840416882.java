import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    NavigableSet<Integer>[] nsa=new NavigableSet[26];
    for(int i=0;i<26;i++){
      nsa[i]=new TreeSet<Integer>();
    }
    for(int i=0;i<n;i++){
      nsa[s.charAt(i)-'a'].add(i);
    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++){
      if(sc.nextInt()==1){
        int idx=sc.nextInt();
        nsa[sc.next().charAt(0)-'a'].add(idx);
      }else{
        int l=sc.nextInt()-1;
        int r=sc.nextInt();
        int ans=0;
        for(int j=0;j<26;j++){
          Integer e=nsa[j].ceiling(l);
          if(e!=null&&e<r){
            ans++;
          }
        }
        System.out.println(ans);
      }
    }
  }
}