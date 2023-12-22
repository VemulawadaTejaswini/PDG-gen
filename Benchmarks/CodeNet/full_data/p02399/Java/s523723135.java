import java.util.Scanner;

class Main{
public static void main(String[] args){
 scanner sc=new scanner(System.in);
int a =sc.nextInt();
int b =sc.nextInt();

int d;
d=a/b;

int r;
r=a%b;

double af,bf,cf;
double af=a;
double bf=b;
double cf=a/b;

System.out.println(d+" "+r+" "+cf);

}
}

