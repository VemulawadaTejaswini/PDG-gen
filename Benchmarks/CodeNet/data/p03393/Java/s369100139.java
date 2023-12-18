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
                char[] word2 = word.toCharArray();
                for(j=25;j != 0;--j){
                    if(word2[j] >= word2[j - 1]){
												String word3 = word.substring(0,j-1);
												String word4 = word.substring(j,25);
												char[] word5 = word4.toCharArray();
												int k;
												for(k = word4.length() - 1;k >= 0;k--){
														if(word2[j - 1]>word5[k]){
																System.out.println(word3 + word5[k+1]);
														}
												}
												break;
                    }
                }
            }
        }
    }
}
