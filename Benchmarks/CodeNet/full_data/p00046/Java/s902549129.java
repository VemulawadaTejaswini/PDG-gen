import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        ArrayList<Double> mountain = new ArrayList<Double>();
        while((buf = br.readLine())!=null){
            mountain.add(new Double(buf));
        }
        Collections.sort(mountain);
        System.out.println((mountain.get(0) - mountain.get(mountain.size() -1)));
    }
}