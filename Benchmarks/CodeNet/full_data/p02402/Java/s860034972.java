import java.util.Scanner;
 
class Main{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
 
    int n = s.nextInt();
 
    int[] a = new int[n];
    int sum=0;
 
    for(int i=0;i<a.length;i++){
      a[i]=s.nextInt();
      sum += a[i];
    }
 
    int max=a[0];
    int min=a[0];
 
 
 
    for(int i=1;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }else if(max>a[i]){
        min=a[i];
      }
    }
 
    System.out.printf("%d %d %d\n",min,max,sum);
  }
}