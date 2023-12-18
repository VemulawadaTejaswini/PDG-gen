import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String cha = sc.next();
        
        int ans = 0;
        int sum = 0;
        
        for(int x=0; x<num; x++){
            if(cha.charAt(x) == 'I'){
                sum++;
                if(sum > ans){
                    ans = sum;
                }
            }else if(cha.charAt(x) == 'D'){
                sum--;
            }
        }
        
        System.out.println(ans);
	}
}
