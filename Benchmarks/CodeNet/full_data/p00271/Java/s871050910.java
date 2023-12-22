import java.util.Scanner;


 class Main{
    int hi,lo,su;
     public void solve(){
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<7;i++){
       hi=sc.nextInt();
        lo=sc.nextInt();
        su=hi-lo;
        System.out.println(su);
    }
}
    public static void main(String[] args){
        Main obj = new Main();
         obj.solve();
    }
}