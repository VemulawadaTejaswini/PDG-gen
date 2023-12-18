import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] dic = new String[H];
        for(int i=0;i<H;i++) dic[i]=sc.next();
        int end = -1;
        for(int i=0;i<H;i++){
          int left = 0;
          while(dic[i].charAt(left)=='.') left++;
          if(end>left){
            System.out.println("Impossible");
            System.exit(0);
          }
          end = 4;
          whlie(dic[i].charAt(end)=='.') end++;
        }
        System.out.println("Possible");
    }
}
