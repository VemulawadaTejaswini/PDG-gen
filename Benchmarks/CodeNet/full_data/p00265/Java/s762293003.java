import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
                line = br.readLine();
                st = new StringTokenizer(line);
            int numCard = Integer.parseInt(st.nextToken());
            int numQ = Integer.parseInt(st.nextToken());

            line = br.readLine();
            st = new StringTokenizer(line);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < numCard; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int d;
            int mod, maxMod;
            for (int i = 0; i < numQ; i++) {
                maxMod = 0;
                d = Integer.parseInt(br.readLine());
                for (int a : list) {
                    mod = a%d;
                    if(mod>maxMod){
                        maxMod = mod;
                    }
                }
                System.out.println(maxMod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}