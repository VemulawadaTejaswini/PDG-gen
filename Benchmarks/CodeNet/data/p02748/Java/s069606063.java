import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    int A;
    int B;
    int M;
    int Ay=100001;
    int By=100001;
    int result=200001;
    Scanner sc = new Scanner(System.in);
    A=sc.nextInt();
    B=sc.nextInt();
    M=sc.nextInt();
    int As[]= new int[A];
    int Bs[]= new int[B];
    int Xs[]= new int[M];
    int Ys[]= new int[M];
    int Cs[]= new int[M];
   for(int i=0;i<A;i++){
     As[i]=sc.nextInt();
   }
   for(int i=0;i<B;i++){
     Bs[i]=sc.nextInt();
   }
   for(int i=0;i<M;i++){
     Xs[i]=sc.nextInt();
     Ys[i]=sc.nextInt();
     Cs[i]=sc.nextInt();

   }
   for(int i=0;i<M;i++){

    if(result>As[Xs[i]-1]+Bs[Ys[i]-1]-Cs[i]){result=As[Xs[i]-1]+Bs[Ys[i]-1]-Cs[i];}
   }
   for(int i=0;i<A;i++){
     if(Ay>As[i]){Ay=As[i];}
   }
   for(int i=0;i<B;i++){
     if(By>Bs[i]){By=Bs[i];}
   }
   if(result>Ay+By){result=Ay+By;}
   System.out.println(result);

  }

}
