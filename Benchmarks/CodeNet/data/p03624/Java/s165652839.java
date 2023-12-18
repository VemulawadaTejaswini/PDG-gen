import java.util.*;

class Main {
    private static Scanner sc;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray(); 
        char[] lib = new char[26];
        for (int i = 0; i < 25; i++) {
            lib[i]=(char)(97+i);
        }
        for (int j= 0; j < lib.length; j++) {
            for (int k = 0; k < S.length; k++) {
                if(lib[j]==S[k]){
                    break;
                }
                if(k==S.length-1) {
                    System.out.println(lib[j]);
                    System.exit(0);
                }                   
            }
        }
        System.out.println("None");
    }
}



