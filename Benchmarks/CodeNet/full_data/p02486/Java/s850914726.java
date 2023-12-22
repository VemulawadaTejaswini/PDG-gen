import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int gou = sc.nextInt();
            if(n == 0 && gou == 0)break;
            int cou = 0;
            for(int i = 1 ; i <= n ; i++){
                for(int j = i + 1 ; j <= n ; j++){
                    for(int k = j + 1 ; k <= n ; k++){
                        if(i + j + k == gou){
                        	cou++;
                        }
                    }
                }
            }
            System.out.println(cou);
        }
    }
}