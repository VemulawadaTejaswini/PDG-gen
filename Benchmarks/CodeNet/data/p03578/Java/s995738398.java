import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Map<Integer,Integer> mapa = new LinkedHashMap<>();
    Map<Integer,Integer> mapb = new LinkedHashMap<>();
    for(int i = 1;i<200001;i++){
      mapa.put(i,0);
      mapb.put(i,0);
    }
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
      int d = sc.nextInt();
      mapa.put(d,mapa.get(d)+1);
    }
    int m = sc.nextInt();
    int[] t = new int[m];
    for(int i = 0;i<m;i++){
      t[i] = sc.nextInt();
      mapb.put(t[i],mapb.get(t[i])+1);
    }

    //keisann
    for(int i = 0;i<t.length;i++){
      int tt = t[i];
      if(!(mapb.get(tt)<=mapa.get(tt))){
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");

  }
}
