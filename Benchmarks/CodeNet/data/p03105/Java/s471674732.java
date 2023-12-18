import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int A = scan.nextInt();
int B = scan.nextInt();
int C = scan.nextInt();
if(A*C < B){System.out.println(C);}
else{System.out.println(C/A);}
}
}