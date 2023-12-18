import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("dai");
        String n = sc.next();
        int cnt = 0;
        for(int i=0; i<3; i++){
            if(n.charAt(i)==n.charAt(i+1)){
                cnt++;
            }
        }
        if(cnt > 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
    
}