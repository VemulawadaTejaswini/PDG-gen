import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int t;
t = sc.nextInt();
int h;
int m;
int s;

h = t/3600;
m = (t-(h*3600))/60;
s = t-((h*3600)+(m*60));
System.out.println(h+":"+m+":"+s);
    }
}