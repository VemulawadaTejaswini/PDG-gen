import java.io.*;

class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int output = 0;
        try{
            String[] keyboardInput = br.readLine().split(" ");
            int K = Integer.parseInt(keyboardInput[0]);
            int S = Integer.parseInt(keyboardInput[1]);
            for(int x = 0; x <= K; x++){
                for(int y = 0; y <= K; y++){
                    for(int z = 0; z <= K; z++){
                        // x + y + z = Sを満たす条件をカウント
                        boolean term =  x + y + z == S;
                        if(term){
                            output++;
                        }
                    }
                }
            }
            System.out.println(output);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}