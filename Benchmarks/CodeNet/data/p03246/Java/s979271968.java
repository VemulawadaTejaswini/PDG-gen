import java.util.Scanner;

class Main{
public static void main(String[] args){
int n;
  int[] v1,v2;
  {
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    v1=new int[n];
    v2=new int[n];
    for(int i=0;i<n/2;i++){
    v1[s.nextInt()]++;
    v2[s.nextInt()]++;
    }
  }
  
  System.out.println(n-v1[max(v1)]-v2[max(v2)]);
}
  static int max(int[] v){
  int ans=0;
    for(int i=1;i<v.length;i++){
    if(v[i]>v[ans]){
    ans=i;
    }
    }
    return ans;
  }
}