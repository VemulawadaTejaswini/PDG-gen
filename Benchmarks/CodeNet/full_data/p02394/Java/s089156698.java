import java.util.Scanner;
class Main{
    int W,H,x,y,r;
    public void Germany() {
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();
        	if(W>x && H>y && x>r && y>r && W>r && H>r) {
        		System.out.println("Yes");
        	}else{
        		System.out.println("No");
        }
        }
    public static void main(String[] args) {
        new Main().Germany();
    }
}