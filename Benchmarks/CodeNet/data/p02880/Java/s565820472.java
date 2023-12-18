import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jdg = 0;
        for(int i = 1;i <= 8;i++){
            for(int j = 1;j <= 9;j++){
                jdg = i*j;
                if(jdg == n)
                break;
            }
            if(jdg == n)
            break;
        }
        System.out.println(jdg == n?"Yes":"No");
    }
}