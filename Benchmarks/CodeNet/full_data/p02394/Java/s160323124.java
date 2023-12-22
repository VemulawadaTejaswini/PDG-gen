import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int w=scan.nextInt();
int h=scan.nextInt();
int x=scan.nextInt();
int y=scan.nextInt();
int r=scan.nextInt();
if(y+r>h||y+r<0||x+r>w||x+r<0||y+r>w||x+r>h){
	System.out.println("No");
}
else{
	System.out.println("Yes");
}
	}
}