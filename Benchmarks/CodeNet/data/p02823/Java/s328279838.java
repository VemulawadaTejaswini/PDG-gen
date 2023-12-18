import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int nik=scan.nextInt();
int na=scan.nextInt();
int nb=scan.nextInt();

if((na-nb)%2==0){
    System.out.println(Math.abs(na-nb)/2);
}else{
    int nc=((na-1)+(nb-1)+1)/2;
    int nd=((nik-na)+(nik-nb)+1)/2;
    System.out.println(Math.min(nc,nd));
}
}
}