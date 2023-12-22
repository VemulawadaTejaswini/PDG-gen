/**
 * Created by Reopard on 2014/05/06.
 */

import java.io.*;

public class Main {
    public static void main(String args[]){
        int n;
        int sides[] = new int[3];
        boolean judge = false;
        String line;
        String tmp[];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            line = reader.readLine();
            n = Integer.parseInt(line);
            for(int i = 0; i < n; i++){
                line = reader.readLine();
                tmp = line.split(" ");
                for(int j = 0; j < sides.length; j++){
                    sides[j] = Integer.parseInt(tmp[j]);
                    sides[j] *= sides[j];
                }
                for(int j = 0; j < sides.length; j++){
                    if(sides[j%3] == sides[(j+1)%3] + sides[(j+2)%3]) {
                        judge = true;
                        break;
                    }else
                        judge = false;
                }
                Answer(judge);
            }
        }catch(IOException e){
            System.exit(0);
        }
    }

    static void Answer(boolean j){
        if(j) System.out.println("YES");
        else System.out.println("NO");
    }
}