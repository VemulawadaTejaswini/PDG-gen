import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int D = sc.nextInt();
int N = sc.nextInt();
if(D==0){
System.out.println(N);}
else if(D==1){
System.out.println(100*N);}
else{
System.out.println(10000*N);}
}
}