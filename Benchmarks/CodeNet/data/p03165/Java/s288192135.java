

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{

    static String[] one;
    static String[] two;
    static int[][] matrix;
    static ArrayList<String> str;

    static void table(){

        for(int i=1;i<=one.length;i++){
            for(int j=1;j<=two.length;j++){

                if(one[i-1].equals(two[j-1])){
                    matrix[i][j] = matrix[i-1][j-1]+1;
                }
                else {
                    matrix[i][j] = max(matrix[i-1][j],matrix[i][j-1]);
                }

            }
        }

    }

    static void ans(){
        int i = one.length, j = two.length;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (one[i-1].equals(two[j-1]))
            {
                // Put current character in result
                str.add(0,one[i-1]);

                // reduce values of i, j and index
                i--;
                j--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (matrix[i-1][j] > matrix[i][j-1])
                i--;
            else
                j--;
        }

    }


    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        one = inp.readLine().split("");
        two = inp.readLine().split("");

        str = new ArrayList<>();

        matrix = new int[one.length+1][two.length+1];
        table();
        ans();
        for (int i=0;i<str.size();i++) {
            System.out.print(str.get(i));
        }




    }
}
