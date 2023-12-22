import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            char[] line = br.readLine().toCharArray();
            char[] after = new char[line.length];
            int alpha = 1;
            
            decrypt:
            while(true){

                for(int beta = 1; beta <= 25; beta++){
                    for(int j = 0; j < line.length; j++){
                        if(line[j] != ' '){
                            after[j] = (char)((alpha * (line[j] - 'a') + beta) % 26 + 'a');
                        }else{
                            after[j] = ' ';                            
                        }
                    }
                    String tmp = String.valueOf(after);
                    if(tmp.indexOf("this") + tmp.indexOf("that ") != -2){
                        break decrypt;
                    }
                }

                alpha += ((alpha+2) % 13 == 0) ? 4 : 2;
            }

            System.out.println(after);
        }
    }
}
