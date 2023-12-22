import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    if(i>=k){
    	System.out.println((a[i]>a[i-k])?"Yes":"No");
    }
  }
}

}