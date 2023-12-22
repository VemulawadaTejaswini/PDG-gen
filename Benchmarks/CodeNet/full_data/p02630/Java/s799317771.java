import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
a[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int res=0;
    for(int i=0;i<k;i++){
int c=sc.nextInt();
      int rep=sc.nextInt();
      help(a,c,rep);
      for(int j=0;j<a.length;j++){
res+=a[j];
      
    }
      System.out.println(res);
      res=0;
  }
  }
    
 static void help(int arr[],int prev,int fill){
		for(int i=0;i<arr.length;i++){
if(arr[i]==prev){
arr[i]=fill;
}
        }
 }
}
