import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
   
            int H = sc.nextInt();
            int W = sc.nextInt();

            int N = sc.nextInt();

            int m = Math.max(H,W);
            
            int total = 0;
            int count = 0;
          
            for(int i = 1; i < H*W; i++){
                total = m * i;
                count++;
                if(total >= N){
                    break;
                }  
            }

        System.out.println(count);
            
    
        sc.close();

        }catch(NoSuchElementException e){
			System.out.println("無効な値です");
		}
    }
}