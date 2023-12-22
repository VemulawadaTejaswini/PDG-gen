import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 0;i < n;i++){
				String snake = scan.next();
				if(snake.substring(0,2).equals(">'") && snake.indexOf("#") >= 2 && snake.charAt(snake.length()-1) == '~'
						&& snake.indexOf('=') >= 2){
					int eqC = 0;
					int sh = 0;
					boolean fl = true;
					for(int j = 2;j < snake.length()-1;j++){
						if(snake.charAt(j) == '=' && sh == 0){
							eqC++;
						}else if(snake.charAt(j) == '='){
							eqC--;
						}else if(snake.charAt(j) == '#' && sh == 0){
							sh = 1;
						}else{
							fl = false;
							break;
						}
					}
					if(fl && eqC == 0){
						System.out.println("A");
					}else{
						System.out.println("NA");
					}
				}else if(snake.substring(0,2).equals(">^") && snake.indexOf("Q=") > 1){
					snake = snake.replaceAll("Q=","");
					if(snake.equals(">^~~")){
						System.out.println("B");
					}else{
						System.out.println("NA");
					}
				}else{
					System.out.println("NA");
				}
			}
		}
	}
}