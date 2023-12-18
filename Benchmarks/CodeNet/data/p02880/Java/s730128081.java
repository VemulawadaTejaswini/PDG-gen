import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean flag = true;
        for(int i = 1; i < 10; i++){
            if(N / i < 10 && N % i == 0){
                flag = true;
                break;
            }
            else if(N / i >= 10){
                flag = false;
            }
        }

        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}