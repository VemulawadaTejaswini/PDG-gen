import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String[] n = number.split(" ");
        int smallNum = Integer.parseInt(n[0]);
        int largeNum = Integer.parseInt(n[1]);
        int position = Integer.parseInt(n[2]);
        
        if(smallNum + position >= largeNum){
            for(int x = smallNum; x <= largeNum; x++){
                System.out.println(x);
            }
            return;
        }
        
        for(int i = smallNum; i < smallNum + position; i++ ){
            System.out.println(i);
        }
        
        for(int j = smallNum+position; j <=largeNum; j++){
            System.out.println(j);
        }
    }
}