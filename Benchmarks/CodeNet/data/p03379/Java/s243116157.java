import java.io.*;
import java.util.*;
class q1
{
  public static void main(String args[])throws IOException
  {
    Scanner in=new Scanner(System.in);
    PrintWriter pw=new PrintWriter(System.out, true);
    int n=in.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      int num=in.nextInt();
      arr.add(num);
      a[i]=num;
    }
    Collections.sort(arr);
    for(int i=0;i<n;i++)
    {
      int ind=Collections.binarySearch(arr, a[i]);
      arr.remove(ind);
      int l=n-1;
      pw.println(arr.get((l)/2));
      arr.add(ind,a[i]);
    }
  }
}
