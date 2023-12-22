import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.ArrayDeque;                                                      

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] dict = new boolean[(int) Math.pow(5, 12)];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String[] in = br.readLine().split(" ");
            if(in[0].equals("insert")){
                //dict.add(in[1]);                                                  
                dict[hash(in[1].toCharArray())] = true;
            }else{
                if(dict[hash(in[1].toCharArray())] == true) sb.append("yes\n");
                else sb.append("no\n");
            }
        }
        System.out.print(sb);
    }

    public static int hash(char[] c){
        int a;
        int hash = 0;
        for(int i = 0; i < c.length; i++){
            switch(c[i]){
            case 'A':
                a = 1;
                break;
            case 'C':
                a = 2;
                break;
            case 'G':
                a = 3;
                break;
            default:
                a = 4;
                break;
            }
            hash = hash * 5 + a;
        }
        return hash;
    }

}