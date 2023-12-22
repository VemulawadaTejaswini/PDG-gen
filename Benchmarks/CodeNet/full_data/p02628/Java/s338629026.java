import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
   int a[]=new int[n];
    for(int i=0;i<n;i++){
a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int res=0;
    for(int i=0;i<k;i++){
		res+=a[i];
    }
    System.out.println(res);
  }
}