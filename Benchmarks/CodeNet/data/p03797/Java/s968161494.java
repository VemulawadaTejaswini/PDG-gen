import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int kumi0 = sc.nextInt();
        int kumi1 = sc.nextInt();
    
        
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
