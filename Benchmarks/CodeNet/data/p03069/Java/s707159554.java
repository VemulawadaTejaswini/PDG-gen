import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int count =0;
        boolean start=false;
        for (int i = 0; i <N ; i++) {
            char c2  = S.charAt(i);
            if(c2 == '#' ){
                start=true;
            }
            if(start && c2 =='.'){
                count++;
            }
        }

        int count2 =0;
        boolean start2=false;
        for (int i = N-1; i >=0 ; i--) {
            char c2  = S.charAt(i);
            if(c2 == '.' ){
                start2=true;
            }
            if(start2 && c2 =='#'){
                count2++;
            }
        }


        System.out.println(Math.min(count,count2));
    }

}
