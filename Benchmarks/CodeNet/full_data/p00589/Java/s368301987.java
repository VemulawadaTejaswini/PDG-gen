import java.io.*;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String a;
                while((a = in.readLine()) != null){
                        int x = 0;
                        char b = a.charAt(0);
                        int c = 0;  
                        while(x < a.length()){
                                if(a.charAt(x) == b){ 
                                        ++c;
                                } else {
                                        gfk(Integer.parseInt((new Character(b)).toString()),c);
                                        c = 1;
                                        b = a.charAt(x);
                                }   
                                ++x;
                        }   
                        gfk(Integer.parseInt(new Character(b).toString()),c);
                        System.out.println("");
                }   
        }   
        static void gfk(int a, int b){ 
                if(a == 0){ 
                        for(int i = 1;i < b; ++i){
                                System.out.print(" ");
                        }   
                } else {
                        --b;
                        --a;
                        System.out.print(key[a][b%key[a].length]);
                }   
        }

        static char key[][]
        =   
        {   
        {'\'',  ',',    '.',    '!',    '?'},
        {'a',   'b',    'c',    'A',    'B',    'C'},
        {'d',   'e',    'f',    'D',    'E',    'F'},
        {'g',   'h',    'i',    'G',    'H',    'I'},
        {'j',   'k',    'l',    'J',    'K',    'L'},
        {'m',   'n',    'o',    'M',    'N',    'O'},
        {'p',   'q',    'r',    's',    'P',    'Q',    'R',    'S'},
        {'t',   'u',    'v',    'T',    'U',    'V'},
        {'w',   'x',    'y',    'z',    'W',    'Z',    'Y',    'Z'}
        };
}