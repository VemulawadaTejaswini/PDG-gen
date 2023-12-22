import java.util.Scanner;

class Main {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
 
        int x = scan.nextInt();
 
        for (int i = 3; i <= x; i++) {
        	int y = 0;
        	y=i;
        	
        	while(y>0){
        		y/=10;
        		if(y%10!=3) continue;
        		System.out.print(i+" ");
        	}
        	
            if (i % 10 != 3 && i % 3 != 0)
                continue;
 
            System.out.print(i + " ");
                }
    }
}