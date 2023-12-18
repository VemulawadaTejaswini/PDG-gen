import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int X=sc.nextInt();
int A=sc.nextInt();
int B=sc.nextInt();

//入力値変換


//出力変数
int ans;

//計算
ans=(X-A)%B;

//出力
System.out.println(ans);

}}