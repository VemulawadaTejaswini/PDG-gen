import java.util.Scanner;
public class judge{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = 1;
	int i = 0;
	while(a != 0){
	    if(a == 0){
		break;
	    }else{
	    i++;
	    a = sc.nextInt();
	    System.out.println("Case " + i + ": " + a);
	    }
	}
    }
}