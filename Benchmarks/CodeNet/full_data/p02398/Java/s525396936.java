import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a,b,c,ctr=0;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            for(int i=a; i <= b; i++){
                if(c % i == 0){
                    ctr++;
                }
            }
            System.out.println(ctr);
        }
    }
}
