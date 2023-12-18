import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] str = line.split(" ");
        
        int kumi0 = Integer.parseInt(str[0]);
        int kumi1 = Integer.parseInt(str[1]);
        
        int kazu = 0;
        
        
        if(kumi0 >= 1 && kumi1 >= 2 ){
        	while(kumi0 >0 && kumi1 >0){
            	
            	
            	kazu++;
            	kumi0--;
            	kumi1 -=2;
            }
        }
        
        while(kumi1 > 0){
        	
        	if(kumi1 < 4){
        		break;
        	}
        	
        	kazu++;
        	kumi1 -=4;
        }
        
        System.out.println(kazu);
        
    }
}
