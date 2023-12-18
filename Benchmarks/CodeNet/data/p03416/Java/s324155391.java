import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a; i<=b; i++){
            boolean flag = true;
            String s = ""+i;
            for(int j=0; j<2; j++){
                if(s.charAt(j)!=s.charAt(4-j)){
                    flag = false;
                    break;
                }
            }
            if(flag == true) cnt++;
        }
        System.out.println(cnt);
    }
}
