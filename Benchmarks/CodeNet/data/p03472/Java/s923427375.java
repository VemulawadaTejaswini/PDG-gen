import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int count = Integer.valueOf(inputs[0]);
        int score = Integer.valueOf(inputs[1]);
        int[] a = new int[count];
        int[] b = new int[count];

        for( int i = 0 ; i<count ; i++) {
            String data = sc.nextLine();
            String[] datas = data.split(" ");
            a[i] = Integer.valueOf(datas[0]);
            b[i] = Integer.valueOf(datas[1]);
        }

        int maxA  = Integer.MIN_VALUE;
        int maxAKey = 0;

        for( int i = 0 ; i<count; i++ ) {
            if(a[i]>maxA) {
                maxA = a[i];
                maxAKey = i;
            }
            else if ( a[i] == maxA && b[i] < b[maxAKey] ){
                maxAKey = i;
            }
        }
        int moves = 0;
        boolean found = true;
        int lastMove = 0;
        if ( a[maxAKey]>b[maxAKey] ) {
            lastMove = a[maxAKey];
        }
        else {
            lastMove = b[maxAKey];
          //  System.out.println("Max A Key: "+ maxAKey);
          //  System.out.println("bMaxAKey:" + b[maxAKey]);
        }

     //   System.out.print("lastMove:" + lastMove);
        while (score> 0 && found == true) {
            found = false;
            int maxFound = Integer.MIN_VALUE;
            int maxBKey = 0 ;
            if(score<=lastMove)	{
                score = score - lastMove;
                moves = moves+1;
                break;
            }

            for( int i = 0; i<count ;i++)   {
                if ( b[i] > a[maxAKey] && b[i]>maxFound && i != maxAKey ) {
                    maxFound =  b[i];
                    maxBKey = i;
                    found = true;
                }
            }
            if( found ) {
                score = score - maxFound;
                b[maxBKey] = Integer.MIN_VALUE;
                moves = moves +1;
            }
        }
        if( score>0)	{
            int extraMoves  = score/maxA;
            moves = moves +extraMoves;
            score = score - extraMoves*maxA;
            if( score>0) {
                if( score > lastMove-maxA)
                {
                    moves = moves +1;
                }
            }
        }
        System.out.println(moves);

    }
}
