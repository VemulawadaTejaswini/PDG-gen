import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int X=sc.nextInt();

//入力値変換

//出力変数
int ans;

//計算
int tempofans=0;

for(int a=0;a<=A;a++){
    for(int b=0;b<=B;b++){
        for(int c=0;c<=C;c++){
            if(X==500*a+100*b+50*c){
                tempofans++;
            }
        }
    }
}
ans = tempofans;

//出力
System.out.println(ans);

}}