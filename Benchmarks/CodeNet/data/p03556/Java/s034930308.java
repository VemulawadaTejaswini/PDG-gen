import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int answer=1;
        for(;answer*answer<=n;answer++){
        }
        System.out.println((answer-1)*(answer-1));
    }
}
