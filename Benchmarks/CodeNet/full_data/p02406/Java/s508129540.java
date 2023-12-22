import java.util.Scanner;
class Main {
	int n,i,x;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 3;i <= n;i++){
			x = i;
			if(x % 3 == 0){
				System.out.print(" ");
				System.out.print(i);
			}else{
				while(x >= 3){
					if(x % 10 == 3){
						System.out.print(" ");
						System.out.print(i);
						x = 0;
					}else{
						x /= 10;
					}
				}
			}
		}
        System.out.println();
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}