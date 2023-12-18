
import java.util.Scanner;

class Main {

public static void main(String[] args){
String a,b;
String m;
Scanner sc = new Scanner(System.in);
a= sc.next();
b= sc.next();
//数字の文字列の後ろに追加 例 1 12→ 121
a=a+b;
int c =Integer.parseInt(a);

m="No";
for(int i=1; i<40; i++){
if((c-(i*i))==0){
m="Yes";
break;
}
};
 System.out.println(m);
}
}
