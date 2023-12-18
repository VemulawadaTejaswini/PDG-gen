import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i, j = 0;
        i = N;
        while(i>0){
            j = j + i%10;
            i = i/10;
        }
        if(N%j == 0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}