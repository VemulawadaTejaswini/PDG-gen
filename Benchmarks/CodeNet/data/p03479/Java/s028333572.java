import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        
        int count = 1;
        while(true){
            X *=2;
            
            if(Y > X){
                count++;
            }else if(Y == X){
                count++;
                break;
            }else{
                break;
            }
        }
        
        System.out.println(count);
    }
}