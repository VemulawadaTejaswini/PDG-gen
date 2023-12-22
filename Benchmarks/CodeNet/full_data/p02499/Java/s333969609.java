import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] num = new int[26];
        boolean breakflag = false;
        char alp = 'a';

        while(!breakflag==true){
            char[] ch = sc.next().toLowerCase().toCharArray();
            for(int i=0; i<ch.length; i++){
                if(ch[i]=='.'){
                    breakflag = true;
                    break;
                }
                else{
                    for(int j=0; j<num.length; j++){
                        if(ch[i]==alp + j){
                            num[j]++;
                            break;
                        }
                    }
                }
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.println(alp++ + " : " + num[i]);
        }

        sc.close();
    }
}