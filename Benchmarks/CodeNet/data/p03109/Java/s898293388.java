import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        int y, m, d;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();

            String[] tbcConnection = line.split("/");
            int cnt = 0;
            int ok_cnt = 0;
            int end_flg = 0;
            for (String tbc : tbcConnection) {
                if (end_flg == 0){
                    if (Integer.parseInt(tbc) < 2019 && cnt == 0) {
                        ok_cnt++;
                    }

                    cnt++;



                    if(Integer.parseInt(tbc) > 2019 && cnt == 1 && ok_cnt == 0) {
                        System.out.println("TBD");
                        end_flg++;
                    } else if (Integer.parseInt(tbc) > 4 && cnt == 2 && ok_cnt == 0) {
                        System.out.println("TBD");
                        end_flg++;
                    } else if (Integer.parseInt(tbc) > 30 && cnt == 3 && ok_cnt == 0) {
                        System.out.println("TBD");
                        end_flg++;
                    }
                }

            }

            if (end_flg == 0) {
                System.out.println("Heisei");
            } else {
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
