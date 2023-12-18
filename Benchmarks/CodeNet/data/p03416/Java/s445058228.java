import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int A=sc.nextInt();
int B=sc.nextInt();


//入力値変換


//出力変数
int ans=0;

//計算
int ma =A/10000;
int sa =(A-ma*10000)/1000;
int ha =(A-ma*10000-sa*1000)/100;
int a =ma*10000+sa*1000+ha*100+sa*10+ma;
int mb =B/10000;
int sb =(B-mb*10000)/1000;
int hb =(B-mb*10000-sb*1000)/100;
int b =mb*10000+sb*1000+hb*100+sb*10+mb;

if(a>=A&&B>=b){
    ans=B/100-A/100+1;
}else if(a<A&&B>=b){
    ans=B/100-A/100;
}else if(a>=A&&B<b){
    ans=B/100-A/100;
}else if(a<A&&B<b){
    ans=B/100-A/100-1;
}

//出力
System.out.println(ans);

}}