import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/6.
 */
public class Main {
    static int si(String s) {
        return Integer.parseInt(s);
    }
    static int run(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int T = Integer.parseInt(scan.nextLine());
            String[] lines = scan.nextLine().split(" ");
            int sum = 0;
            for(int i = 0;i<lines.length-1;i++){
                for(int j = lines.length - 1;j>=i+1;j--){
                    if(si(lines[j])<si(lines[j-1])){
                        String s = lines[j];
                        lines[j] = lines[j-1];
                        lines[j-1] = s;
                        sum++;
                    }
                }
            }
            for(int i = 0;i<lines.length;i++){
                if(i==0)
                    System.out.print(lines[0]);
                else
                    System.out.print(" "+lines[i]);
            }
            System.out.println();
            System.out.println(sum);

        }
        return 1;
    }

    public static void main(String[] args) {
        run(args);
    }
}