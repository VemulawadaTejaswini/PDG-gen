import java.io.*;
import java.util.*;

class Coordinate
{
  int X;
  int Y;
  Coordinate(int X,int Y)
  {
    this.X =X;
    this.Y =Y;
  }
}
class Pair
{
  Coordinate C;
  int y ;
  Pair(Coordinate C, int y)
  {
    this.C= C;
    this.y = y;
  }
}
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Coordinate arr[] = new Coordinate[n];
    for(int i = 0;i<n;i++)
    {
      int x =in.nextInt();
      int y =in.nextInt();
      arr[i] = new Coordinate(x,y);
    }
    HashMap<Pair,Double> map = new HashMap<>();
    double ans = findMaxDis(0,0,arr,n,0,map);
    System.out.printf("%10f",ans);
  }
  static double findMaxDis(int X,int Y, Coordinate arr[],int n,int i, HashMap<Pair,Double> map)
  {
    if(i>=n)
      return disCal(X,Y);
    int x =arr[i].X;
    int y = arr[i].Y;
    double ans=0;
    if(map.containsKey(new Pair(arr[i],i)))
      ans = map.get(new Pair(arr[i],i));
    else
    {
      ans = Math.max(findMaxDis(X,Y,arr,n,i+1,map),findMaxDis(X+x,Y+y,arr,n,i+1,map));
    }
    return ans;
  }
  static double disCal(int X,int Y)
  {
    return Math.sqrt(X*1.0*X+Y*1.0*Y);
  }
}