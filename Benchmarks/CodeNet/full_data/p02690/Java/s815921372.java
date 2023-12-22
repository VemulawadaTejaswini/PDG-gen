import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = -118; i <= 119; i++){
            for(int j = -118; j <= 119; j++){
                if((int)(Math.pow(i,5) - Math.pow(j,5)) == n){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}

