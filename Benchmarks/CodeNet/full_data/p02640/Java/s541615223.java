import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        String ans = "No";
        for(int i = 0;i<=x;i++){
            for(int j = 0;i+j<=x;j++){
                if(i*2+j*4==y){
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
