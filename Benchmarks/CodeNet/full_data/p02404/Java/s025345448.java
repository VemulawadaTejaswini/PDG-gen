
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int W,H;
for(;;){
H =sc.nextInt();
W =sc.nextInt();
if(H == 0) break;
for(int a=0; a<W; a++) System.out.print("#");
System.out.println();
for(int c=2; c<H; c++){
System.out.print("#");
for(int b=2; b<W; b++) System.out.print(".");
System.out.println("#");
}
for(int a=0; a<W; a++) System.out.print("#");
System.out.println();
System.out.println();
}
}
}