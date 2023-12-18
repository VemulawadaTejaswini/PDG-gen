import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int xx = 0;
int yy = 0;

if(x == 2){
xx = 1;
}else if(x == 4||x == 6||x == 9||x == 11){
xx = 2;
}else{
xx = 3;
}

if(y == 2){
yy = 1;
}else if(y == 4||y == 6||y == 9||y == 11){
yy = 2;
}else{
yy = 3;
}

if(xx == yy){
System.out.println("Yes");
}else{
System.out.println("No");
}

}
}