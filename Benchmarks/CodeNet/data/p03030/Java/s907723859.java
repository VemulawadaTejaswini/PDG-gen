import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            String[][] S = new String[N][3];

            for(int i = 0 ; i < N ; i++){
                S[i][0] = sc.next();
                S[i][1] = sc.next();
                S[i][2] = String.valueOf(i+1);
            }
            sc.close();


            Arrays.sort(S, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {

                    if (o1[0].equals(o2[0])) {
                        return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]); 
                    } else {
                        return o1[0].compareTo(o2[0]); 
                    }
                }
            });
/*
            for(int i = 0 ; i < N ; i++){
                System.out.print(S[i][0] + " ");
                System.out.print(S[i][1]+ " ");
                System.out.print(S[i][2]+ " ");
                System.out.println("");
            } 
*/

            for(int i = 0 ; i < N ; i++){
                System.out.println(S[i][2]);
            }
        }
   }

