
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] sn=sc.nextLine().split(" ");
int mae=Integer.parseInt(sn[0]);
int naka=Integer.parseInt(sn[1]);
int usi=Integer.parseInt(sn[2]);


if(mae+naka+usi>21){
System.out.println("bust");

}else{
System.out.println("win");

}



	}
}