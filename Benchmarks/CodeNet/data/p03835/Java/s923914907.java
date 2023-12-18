import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sc.nextInt();
        
        int cnt = 0;
        
        for(int x = 0; x<=num; x++){
            for(int y = 0; y<=num; y++){
                for(int z=0; z<=num; z++){
                    if(x+y+z == sum){
                        cnt++;
                    }
                }
            }
        }
        
        System.out.println(cnt);
	}
}