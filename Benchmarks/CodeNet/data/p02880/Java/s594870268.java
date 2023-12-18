import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = 0;
        boolean flag = false;

        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= 9;j++){
                tmp = i * j;
                if(tmp == N){
                    flag = true;
                }
            }
        }
        if(flag == true){
            System.out.println("Yes");
        } else System.out.println("No");
        
    }
}