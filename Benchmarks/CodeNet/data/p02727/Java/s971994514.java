import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int[] p = new int[a];
    int[] q = new int[b];
    int[] r = new int[c];
    
    for(int i=0;i<a;i++){
      p[i] = sc.nextInt();
    }    
    for(int i=0;i<b;i++){
      q[i] = sc.nextInt();
    }
    for(int i=0;i<c;i++){
      r[i] = sc.nextInt();
    }
    
    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);
   
    int[] z = new int[x+y+c];
    for(int i=0;i<x;i++){
      z[i] = p[a-x+i];
    }   
    for(int i=0;i<y;i++){
      z[i+x] = q[b-y+i];
    }
    for(int i=0;i<c;i++){
      z[x+y+i] = r[i];
    }  
    Arrays.sort(z);

    int ans = 0;
    for(int i=c;i<x+y+c;i++){
      ans += z[i];
    }
    System.out.println(ans);
  }
}