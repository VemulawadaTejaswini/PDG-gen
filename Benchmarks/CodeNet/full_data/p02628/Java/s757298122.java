import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int m=obj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
		a[i]=obj.nextInt();}
    Arrays.sort(a);
    int sum=0;
    for(int i=0;i<m;i++)
    sum=sum+a[i];  
    System.out.println(sum);
  }
}