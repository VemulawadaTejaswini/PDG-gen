import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
long N=sc.nextInt();
long M=sc.nextInt();


//入力値変換


//出力変数
long ans=0;

//計算
if(N>=2&&M>=2){
    ans=(N-2)*(M-2);
}else if(N==1){
    ans=Math.abs(M-2);
}else if(M==1){
    ans=Math.abs(N-2);
}

//出力
System.out.println(ans);

}}