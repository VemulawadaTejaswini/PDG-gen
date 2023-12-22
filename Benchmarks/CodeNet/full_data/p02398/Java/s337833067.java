import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int ed = sc.nextInt();
        int x = sc.nextInt();
        int yakusu = 0;
        
        for(int i=st; i<=ed; i++){
            if(x%i == 0){
                yakusu++;
            }
        }
        
        System.out.println(yakusu);
            
    }
}
