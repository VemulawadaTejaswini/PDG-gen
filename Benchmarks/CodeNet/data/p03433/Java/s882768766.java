import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int N = sc.nextInt();
int A = sc.nextInt();

//出力変数
String ans;

//計算
if(N%500 <= A){
ans = "Yes";
}else{
ans = "No";
}

//出力
System.out.println(ans);

}
}
