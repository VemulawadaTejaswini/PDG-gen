import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        ArrayList<String> A = new ArrayList<>();
        for (int i=0;i<N;i++){
            str = br.readLine();
            if (A.contains(str)){
                A.remove(str);
            } else {
                A.add(str);
            }
        }
        System.out.println(A.size());
    }
}