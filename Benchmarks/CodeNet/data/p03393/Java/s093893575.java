import java.util.*;
public class Main {
	  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcd = abc.toCharArray();
        String cba = "zyxwvutsrqponmlkjihgfedcba";
        int j;
        if(word.equals(cba)){
            System.out.println(-1);
        }
        else{
            char[] dcba = cba.toCharArray();
            if(word.length() != 26){
                int i;
                for(i=0;word.indexOf(abcd[i]) != -1;i++){
                }
                System.out.println(word + abcd[i]);
            }
            else{
                char[] word2 =word.toCharArray();
                for(j=25;j != 0;--j){
                    if(word2[j] != dcba[j]){
                        char lw = word.charAt(j);
                        System.out.println(lw);
                        int slw = abc.indexOf(lw) - 1;
                        System.out.println(slw);
                        int slw_num = word.indexOf(abcd[slw]);
                        System.out.println(slw_num);
                        word = word.substring(0,slw_num);
                        System.out.println(word);
                        System.out.println(word + lw);
                        break;
                    }
                }
            }
        }
    }
}

