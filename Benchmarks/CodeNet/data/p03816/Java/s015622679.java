import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      mp.put(a,mp.getOrDefault(a,0)+1);
    }
    int del=0;
    for(Map.Entry<Integer,Integer> me:mp.entrySet()){
      del+=Math.max(me.getValue()-1,0);
    }
    del=(del+1)/2*2;
    System.out.println(n-del);
  }
}