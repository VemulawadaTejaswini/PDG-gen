import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] bCard = br.readLine().split(" ");
        final String[] sCard = new String[bCard.length];
        System.arraycopy(bCard, 0, sCard, 0, sCard.length);

        bubbleSort(bCard);
        out.print(bCard[0]);
        for(int i = 1; i<n; i++){
            out.print(' ');
            out.print(bCard[i]);
        }
        out.println();
        out.println("Stable");
        stableSort(sCard);
        out.print(sCard[0]);
        for(int i = 1; i<n; i++){
            out.print(' ');
            out.print(sCard[i]);
        }
        out.println();
        out.println(isSame(bCard, sCard) ? "Stable" : "Not stable");
        out.flush();
    }
    private static void bubbleSort(String[] a){
        final int n = a.length;
        for(int i = 0; i<n; i++){
            for(int j = n-1; j>i; j--){
                if(a[j].charAt(1)<a[j-1].charAt(1)){
                    final String t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
        }

    }
    private static void stableSort(String[] a){
        final int n = a.length;
        for(int i = 0; i<n; i++){
            int mini = i;
            for(int j = i+1; j<n; j++){
                if(a[j].charAt(1)<a[mini].charAt(1)) mini = j;
            }
            if(i!=mini){
                final String t = a[i];
                a[i] = a[mini];
                a[mini] = t;
            }
        }
    }
    private static boolean isSame(String[] a, String[] b){
        if(a.length!=b.length) return false;
        final int n = a.length;
        for(int i = 0; i<n; i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}