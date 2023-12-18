
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
    // String nyu=sc.nextLine();

//int[] num=new int[6];

int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
int C=Integer.parseInt(nyu[2]);

int result=B/A;


//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);

System.out.println(result>C-1 ? C : result) ;

	}
}