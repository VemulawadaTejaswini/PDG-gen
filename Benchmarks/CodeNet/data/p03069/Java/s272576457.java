import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int count = 0;
        for(int i = 0; i < N-1; i++){
            if(S.charAt(i) == '#'){
                if(S.charAt(i+1) == '.'){
                    count++;
                    try{
                        if(S.charAt(i-1) == '#' && S.charAt(i+2) == '.'){
                            count++;
                        }
                    }catch(StringIndexOutOfBoundsException e){
                    }
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}