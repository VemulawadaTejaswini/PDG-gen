import java.util.Scanner;

class Main{

public static void main(String args[]){

Scanner scan =new Scanner(System.in);

int w =scan.nextInt();

int h =scan.nextInt();

int x =scan.nextInt();

int y =scan.nextInt();

int r =scan.nextInt();


if(h>=y+r && w>=x+r && x-r>=0 && y-r>=0){System.out.println("Yes");}

else {System.out.println("No");}

}}
