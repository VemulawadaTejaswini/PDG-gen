import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<b)System.out.println("a < b");
	else if(a>b)System.out.println("a > b");
	else System.out.println("a == b");
    }
    public static void main(String[]ag){
	new Main().main();
    }
}