import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long count = 0;
        while(x>4){
            if(x>=500){
                x -= 500;
                count += 1000;
            }else if(x>=5){
                x -= 5;
                count += 5;
            }
        }
        
        System.out.println(count);
    }
}