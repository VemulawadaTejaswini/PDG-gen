import java.util.*;

class Main{
  public static boolean check(int[] a,int[] b,int x){
    for(int i=0;i<a.length;i++) if(a[i]-b[i]<x) return false;
    return true;
  }

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int M=s.nextInt();
    int X=s.nextInt();
    int[][] List=new int[N][M+1];
    for(int i=0;i<N;i++) for(int j=0;j<M+1;j++) List[i][j]=s.nextInt();
    int[] box=new int[M+1];
    for(int i=0;i<N;i++) for(int j=0;j<M+1;j++) box[j]+=List[i][j];
    int flag=0;
    for(int j=1;j<M+1;j++) if(box[j]<X) flag=-1;
    if(flag==-1)System.out.println(flag);
    else{
       for(int i=0;i<N-1;i++){
         int k=0;
         for(int j=k;j<N-1;j++){
           if(List[j][0]>List[j+1][0]){
             int[] t=List[j].clone();
             List[j]=List[j+1].clone();
             List[j+1]=t.clone();
           }
         }
         k++;
       }
    for(int i=N-1;i>=0;i--) if(check(box,List[i],X)) for(int j=0;j<M+1;j++) box[j]-=List[i][j];
    System.out.println(box[0]);

     }

  }  
}