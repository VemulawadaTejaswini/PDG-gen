import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ss = s.split("");
        int ans = 0;
        for( int i = 0 ; i < ss.length - 1 ; i++ ){
            if( ss[i].equals(ss[i+1])){
                if( i+2 == ss.length ){
                    ans++;
                    break;

                }
                else {
                    ss[i+2]=ss[i+1]+ss[i+2];
                    i++;
                }
            }
            ans++;
        }

        System.out.println( ans );

    }

}