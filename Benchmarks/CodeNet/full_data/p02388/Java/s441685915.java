import java.util.Scanner; 
class Main{
    static public void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	while(1>x || x>100) System.out.println("imput agian.");
	System.out.println(x*x*x);
    }
}
