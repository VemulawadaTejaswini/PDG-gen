import java.util.Scanner;

class Main{

public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

String shutsuryoku;

if(a < b){
shutsuryoku = "a < b";

}else if(a > b){
shutsuryoku = "a > b";
}else if(a == b){
shutsuryoku = "a == b";
}
System.out.println(shutsuryoku);

}
}

