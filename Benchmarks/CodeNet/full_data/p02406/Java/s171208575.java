import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i <= n){
            if(checkNum(i)){ System.out.print(" " + i); }
            i++;
        }
        System.out.println();
    }
    public static boolean checkNum(int i){
        if(i % 3 == 0){ return true; }
        else{
            while(i > 0){
                if(i % 10 == 3){ return true; }
                i /= 10;
            }
        }
        return false;
    }
}
