import java.util.*;

/*class Rcontest101C{
  public static long dk(int[] x,int point,int cost,int n,int k,int index){
    int i  = index;
    int i2 = index;
    long r = 1000000001;
    long s = 1000000001;
    int[] nx = new int[x.length];
    if(n < k){
      if(i < x.length){
        for(;i < x.length;i++){
          if(x[i] != 100000001){
            int f = x[i];
            x[i] = 100000001;
            System.arraycopy(x,0,nx,0,x.length);
            r = dk(nx,point+f,cost+Math.abs(f)-point,n + 1,k,i + 1);
        }
      }
  }
  if(i2 > 0){
    i2 = i2 - 1;
    for(;i2 >  -1;i2--){
      if(x[i2] != 100000001){
        int f = x[i2];
        x[i2] = 100000001;
        System.arraycopy(x,0,nx,0,x.length);
        s = dk(nx,point+f,cost+Math.abs(f),n + 1,k,i2 - 1);
    }
  }
  }
  return  r>s?s:r;
}
return cost;
}
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] x = new int[n];
    int index = 100001;
    for(int i = 0;i < n;i++){
      x[i] = scan.nextInt();
      if(index == 100001 && x[i] >= 0){
        index = i;
      }
    }
    long result = dk(x,0,0,0,k,index);
    System.out.println(result);
  }
}*/

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] x = new int[n];
    long a = 0;
    long b = 0;
    for(int i = 0;i < x.length;i++){
      x[i] = scan.nextInt();
    }
    for(int i = 0; i < x.length-k+1;i++){
      if(i == 0){
        b = Math.abs(x[i]) + Math.abs(x[i]-x[i+k-1]);
        continue;
      }
      a = Math.abs(x[i]) + Math.abs(x[i]-x[i+k-1]);
      b = b < a?b:a;
    }
    System.out.println(b);
  }
}