import java.util.*;

class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
if(a > b){
int i = a;
a = b;
b = i;
}
if(b > c){
int i = b;
b = c;
c = i;
}
if(a > b){
int i = a;
a = b;
b = i;
}

}

}