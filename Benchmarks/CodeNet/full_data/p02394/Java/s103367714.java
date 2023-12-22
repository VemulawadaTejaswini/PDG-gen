import java.util.Scanner;
class Main {
    public void kami() {
        		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		if(W >= x + r && H >= y + r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

    }
    
	public static void main(String[] args) {
        new Main().kami();
	}

}