import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n  =sc.nextInt();
        int k = sc.nextInt();
        String brank = sc.nextLine();

        int max = 0;
        int d = 0;

        for(int i =1; i <= k; i++){
            d = sc.nextInt();
            brank = sc.nextInt();
            brank = sc.nextInt();
            if(d >= max){
                max = d;
            }
        }

        System.out.println(n-d);
        
    }
}