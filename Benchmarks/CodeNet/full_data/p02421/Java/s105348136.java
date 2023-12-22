import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        int tPoint = 0;
        int hPoint = 0;

        int n = sc.nextInt();

        for(int cards = 0; cards < n; cards ++) {
            String taro = sc.next();
            String hanako = sc.next();

            if(taro.compareTo(hanako) == 1) {
		tPoint += 3;
                
		}else if(taro.compareTo(hanako) == -1) {
			hPoint += 3;
                        
		}else if(taro.compareTo(hanako) == 0){
			tPoint ++;
			hPoint ++;		
                }
        }

        System.out.print(tPoint);
        System.out.print(" ");
        System.out.print(hPoint);
    }
}