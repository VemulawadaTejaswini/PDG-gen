import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] mozi = word.split("");

        int ans = equal(mozi);

        if(ans == 1){
            System.out.println("Yes");
        }else if(ans == 0){
            System.out.println("No");
        }
    }

    public static int equal(String[] lung){
        int answer = 0;
        for(int a=0; a<lung.length-1; a++){
            for(int b=a+1; b<lung.length; b++){
                if(lung[a].equals(lung[b])){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}