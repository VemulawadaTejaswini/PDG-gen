import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int x = stdIn.nextInt();
        int left = 0;
        int right = 0;

        for(int i = 0; i < m; i++){
            int a = stdIn.nextInt();
            if(a < x)
                left++;
            else
                right++;
        }
        
        if(right > left)
                System.out.println(left);
        else
            System.out.println(right);
    }
}