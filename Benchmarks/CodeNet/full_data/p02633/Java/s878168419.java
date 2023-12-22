import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int X =sc.nextInt();
    int j=0;
    for(int i=1;;i++){
      j=360*i;
      if(j%X==0){System.out.println(j/X);System.exit(0);}}
  }
}