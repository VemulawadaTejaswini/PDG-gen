import java.io.*;

public class PrintRectangle{
    public static void main(String[] args) {
        int[] H;
        int[] W;
        H = new int[100000];
        W = new int[100000];
        int i, j, k, l;
        int count = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
        for(i=1;i<100000;i++){
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        H[i] = Integer.parseInt(line1);
        W[i] = Integer.parseInt(line2);
        System.out.println();
        if (H[i]==0 && W[i]==0) break;
        count++;
        }

        for (j=1;j<=count;j++){
            for (k=1;k<=H[j];k++){
                for (l=1;l<=W[j];l++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    } catch(IOException e){
        System.out.println(e);
    } catch(NumberFormatException e) {
        System.out.println("false");
    }
    }
}
