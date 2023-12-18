import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        sc.nextLine();

        if(N >= 10){
            System.out.println(R);
        }else{
            System.out.println(100*(10-N));
        }
        sc.close();
    }
}