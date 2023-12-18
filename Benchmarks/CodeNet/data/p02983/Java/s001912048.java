import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            String input[] = str.split(" ");
            int L = Integer.valueOf(input[0]);
            int R = Integer.valueOf(input[1]);
            
            int result = 2018;
          if(R-L >2019){
            R = L+2019;
          }
          if(L > 2019){
            L -= 2019;
            R -= 2019;
          }
            for(int i = L; i<R; i++) {
              int nMod = i % 2019;
				if(nMod == 0 || result == 0){
                  result = 0;
                  break;
                }
              for(int j = i+1; j<=R; j++) {
                int mMod = j % 2019;
                  int N = nMod * mMod;
                    if( N  < result && N  > 0 ) {
                        result = N ;
                    } else if(N == 0){
                      result = N ;
                      break;
                    }
                }
            }
            System.out.println(result);
            
            
        }catch(IOException e) {
            
        }
    }

}
