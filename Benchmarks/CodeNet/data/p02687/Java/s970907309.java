import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String contest_last_week = br.readLine();
            if(contest_last_week=="ABC"){System.out.print("ARC");}
            if(contest_last_week=="ARC"){System.out.print("ABC");}
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
