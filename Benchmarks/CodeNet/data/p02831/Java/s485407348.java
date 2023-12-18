
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] sn=sc.nextLine().split(" ");
int mae=Integer.parseInt(sn[0]);
int usi=Integer.parseInt(sn[1]);

long num=1;

while(true){

if(num%mae==0 && num%usi==0){
System.out.println(num);
break;
}

num++;
}





	}
}