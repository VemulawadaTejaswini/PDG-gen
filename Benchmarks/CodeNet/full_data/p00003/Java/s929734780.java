import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try{
            ArrayList<Integer> side;
            String line = br.readLine();
            StringTokenizer tokens;
            while(line!=null){
                tokens = new StringTokenizer(line);
                side = new ArrayList<>();
                side.add(Integer.parseInt(tokens.nextToken()));
                side.add(Integer.parseInt(tokens.nextToken()));
                side.add(Integer.parseInt(tokens.nextToken()));
                java.util.Collections.sort(side);
                if(side.get(0)*side.get(0)+side.get(1)*side.get(1)==side.get(2)*side.get(2)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                line = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println(System.err);
        }

    }

}