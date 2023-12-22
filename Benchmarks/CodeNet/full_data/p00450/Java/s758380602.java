import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			boolean[] stone = new boolean[n];
			stone[0] = (scan.nextInt() == 1)?true:false;
			for(int i = 2;i <= n;i++){
				if((i&1) == 0){
					boolean t = (scan.nextInt() == 1)?true:false;
					if(stone[i-2] != t){
						for(int j = i-2;j >= 0 && stone[j] != t;j--){
							stone[j] = t;
						}
					}
					stone[i-1] = t;
				}else{
					stone[i-1] = (scan.nextInt() == 1)?true:false;
				}
			}
			int count = 0;
			for(int i = 0;i < n;i++){
				if(!stone[i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}