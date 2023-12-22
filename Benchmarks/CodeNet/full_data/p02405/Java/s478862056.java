import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            if(Integer.parseInt(line2[0]) == 0)
                if(Integer.parseInt(line2[1]) == 0)
                    break;
            print(Integer.parseInt(line2[0]),Integer.parseInt(line2[1]));
        }
    }
    static void print(int h,int w) {
        for(int i=0;i < h;i++) {
            for(int j = 0; j < w ; j++) {
                if(i % 2 == 0) {
                    if(j % 2==0) {
                        System.out.print("#");
                    }else {
                        System.out.print(".");
                    }
                }
                else {
                    if(j % 2==0) {
                        System.out.print(".");
                    }else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}