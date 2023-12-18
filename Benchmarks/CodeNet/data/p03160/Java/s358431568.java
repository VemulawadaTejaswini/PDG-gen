import java.util.*;
public class  solution{
  static Integer [][]cache;
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    cache=new Integer[n][100000];
    int []height=new int[n];
    for(int i=0;i<n;i++){
      height[i]=sc.nextInt();
    }
    System.out.println(ans(height,0,0));
  }
    public static int ans(int[] h,int index,int val){
        if(cache[index][val]!=null) return cache[index][val];
        if(index==h.length-1) return val;
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        if(index+1<h.length){
            one=ans(h,index+1,val+Math.abs(h[index]-h[index+1]));
        }
        if(index+2<h.length){
            two=ans(h,index+2,val+Math.abs(h[index]-h[index+2]));
        }
        if (cache[index][val]==null) cache[index][val]=Math.min(one,two);
        return cache[index][val];
    }
}