import java.util.Scanner;
class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String moji = null;

if(a<b){
	moji = "<";
}
if(a>b){
	moji = ">";
}
if(a==b){
	moji = "=";
}
System.out.println(a+" "+moji+" "+b);

    }
}