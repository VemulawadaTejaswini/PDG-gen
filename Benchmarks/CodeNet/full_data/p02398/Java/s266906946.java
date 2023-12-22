import java.util.Scanner;
class Main {
    public void kami() {
                Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x,j = 0;
		
		for(int i = a; i <= b; i++){
			x = c % i;
			if(x == 0){
				j++;
			}
			
		}
		System.out.println(j);

    }
	public static void main(String[] args) {
    new Main().kami();
	}

}