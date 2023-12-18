import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int left=0;
        for(int i=0;i<H;++i){
            String s = scan.next();
            int newl=0;
            for(int j=0;j<W;++j){
                if(s.charAt(j)=='#')newl=j;
                if(newl < left){
                    System.out.println("Impossible");
                    return;
                }
            }
            left = newl;
        }
        System.out.println("Possible");
    }
}