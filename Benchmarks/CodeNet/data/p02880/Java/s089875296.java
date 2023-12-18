import java.util.*;
import static java.lang.System.*;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
  int A=0;
	koko: for(int i=1;i<=9;i++){
    for(int j=1;j<=9;j++){
    if((i*j)==N){
    out.println("Yes");
    break koko;
    }
    }
      A=i;
    }
if(A==9)
  out.println("No");



}
}
