import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        Boolean flag  = true;
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();

        int r = in_data[0];
        int d = in_data[1];
        int x = in_data[2];
        int tmp = x;
        int ans = 0;

        for(int i=0;i<10;i++){
            ans = r*tmp - d;
            tmp = ans;
            System.out.println(ans);
        }
    }
}