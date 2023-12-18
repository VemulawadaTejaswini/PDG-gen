
// 問題URL
//

import java.util.*;
import java.lang.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        String[] b = scanner.nextLine().split(" ");
        String[] c = scanner.nextLine().split(" ");
        int[] bingo = new int[Integer.parseInt(scanner.next())];

        for(int i =0; i < bingo.length; i++) {
            bingo[i] = Integer.parseInt(scanner.next());
        }

        //System.out.println(bingo.length);
        int[] ia = Stream.of(a).mapToInt(Integer::parseInt).toArray();
        int[] ib = Stream.of(b).mapToInt(Integer::parseInt).toArray();
        int[] ic = Stream.of(c).mapToInt(Integer::parseInt).toArray();


        int array[][] =  {
               ia,
               ib,
               ic
        };


        for(int i =0; i < array.length; i++) {
            for (int j =0; j < array.length; j++) {
                for(int k =0; k < bingo.length; k++) {
                    if (array[i][j] == bingo[k]) {
                        array[i][j] = -1;
                    }
                }
            }
        }
        if((array[0][0] < 0 == array[0][1] < 0 == array[0][2] < 0) ||
                (array[0][0] < 0 == array[1][0] < 0 == array[2][0] < 0) ||
                (array[0][0] < 0 == array[1][1] < 0 == array[2][2] < 0) ||
                (array[0][1] < 0 == array[1][1] < 0 == array[2][1] < 0) ||
                (array[0][2] < 0 == array[1][2] < 0 == array[1][3] < 0) ||
                (array[1][0] < 0 == array[1][1] < 0 == array[1][2] < 0) ||
                (array[2][0] < 0 == array[2][1] < 0 == array[2][2] < 0) ||
                (array[2][0] < 0 == array[1][1] < 0 == array[0][2] < 0)
        ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //System.out.println(Arrays.toString(array[0]));
        //System.out.println(Arrays.toString(array[1]));
        //System.out.println(Arrays.toString(array[2]));
    }
}
