import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long nik=scan.nextInt();
long na=scan.nextInt();
long nb=scan.nextInt();

if((na-nb)%2==0){
    System.out.println(Math.abs(long na-nb)/2);
}else{
    long nc=((na-1)+(nb-1)+1)/2;
    long nd=((nik-na)+(nik-nb)+1)/2;
    System.out.println(Math.min(long nc,long nd));
}
}
}