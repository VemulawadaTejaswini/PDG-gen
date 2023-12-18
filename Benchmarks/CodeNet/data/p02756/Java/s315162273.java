import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int q = Integer.parseInt( sc.nextLine() );
        String[] params;
        boolean isReverse = false;
        for( int i = 0 ; i < q ; i++ ){
            params = sc.nextLine().split(" ");
            int t = Integer.parseInt(params[0]);
            if( t == 1 ){
                isReverse = !isReverse;
            }
            else {
                int f = Integer.parseInt(params[1]);
                if( isReverse ){
                    if( f == 1 ){
                        s.append(params[2]);
                    }
                    else {
                        s.insert(0, params[2]);
                    }
                }
                else {
                    if( f == 1 ){
                        s.insert(0, params[2]);
                    }
                    else {
                        s.append(params[2]);
                    }
                }
            }
        }

        if( isReverse ){
            s.reverse();
        }

        System.out.println( s.toString() );

    }

}
