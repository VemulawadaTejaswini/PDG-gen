import java.util.*;

class Main {

    static String codeA (char c) {
        switch (c) {
            case ' ':   return "101";
            case '\'':  return "000000";
            case ',':   return "000011";
            case '-':   return "10010001";
            case '.':   return "010001";
            case '?':   return "000001";
            case 'A':   return "100101";
            case 'B':   return "10011010";
            case 'C':   return "0101";
            case 'D':   return "0001";
            case 'E':   return "110";
            case 'F':   return "01001";
            case 'G':   return "10011011";
            case 'H':   return "010000";
            case 'I':   return "0111";
            case 'J':   return "10011000";
            case 'K':   return "0110";
            case 'L':   return "00100";
            case 'M':   return "10011001";
            case 'N':   return "10011110";
            case 'O':   return "00101";
            case 'P':   return "111";
            case 'Q':   return "10011111";
            case 'R':   return "1000";
            case 'S':   return "00110";
            case 'T':   return "00111";
            case 'U':   return "10011100";
            case 'V':   return "10011101";
            case 'W':   return "000010";
            case 'X':   return "10010010";
            case 'Y':   return "10010011";
            case 'Z':   return "10010000";
        }
        return "";
    }

    static void solve (char[] line) {
        String tmp = "";

        for (char c : line) {
            tmp += codeA(c);    
        }

        switch (tmp.length() % 5) {
            case 1: tmp += "0000"; break;
            case 2: tmp += "000"; break;
            case 3: tmp += "00"; break;
            case 4: tmp += "0"; break;
        }


        char [] codeB = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', '-', '\'', '?' };

        String result = "";

        for(int i = 0; i < tmp.length() / 5; i++) {
            int num = 0;
            int mult = 16;
            for (int j = 0; j < 5; j++) {
                num += Integer.parseInt("" + tmp.charAt(5*i+j)) * mult;
                mult /= 2;
            }
            result += codeB[num];
        }


        System.out.println(result);
        
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            solve(sc.nextLine().toCharArray());
        }
    }
}