import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            ArrayList<Integer> side;
            String line = br.readLine();
            int x = Integer.parseInt(line);
            StringTokenizer tokens;
            for(int i=0;i<x;i++){
                line = br.readLine();
                tokens = new StringTokenizer(line);
                side = new ArrayList<>();
                side.add(Integer.parseInt(tokens.nextToken()));
                side.add(Integer.parseInt(tokens.nextToken()));
                side.add(Integer.parseInt(tokens.nextToken()));
                Collections.sort(side);
                if(side.get(0)*side.get(0)+side.get(1)*side.get(1)==side.get(2)*side.get(2)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}