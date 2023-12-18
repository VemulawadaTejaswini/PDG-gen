import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        sc.close();

        int w = 0;
        int gcnt = 0;
        int pcnt = 0;

        for(int i = 0; i < c.length; i++){
            if(pcnt == gcnt){
                if(c[i] == 'p')
                    w--;
                else{
                }
                gcnt++;
            } else if(pcnt < gcnt){
                if(c[i] == 'p'){
                } else{
                    w++;
                }
                pcnt++;
            }
        }
        System.out.println(w);
    }
}