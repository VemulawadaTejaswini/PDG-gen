import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String question, answer;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        question = sc.next();
        answer = sc.next();
        if(question.equals("0") && answer.equals("0"))return false;
        return true;
    }

    static void solve(){
        int hit = 0, brrow = 0;
        boolean hit_flag = false;
        for(int i = 0; i < question.length(); i++){
            if(question.charAt(i) == answer.charAt(i)){
                hit++;
                hit_flag = true;
            }
            if(hit_flag == false){
                for(int j = 0; j < answer.length(); j++){
                        if(question.charAt(i) == answer.charAt(j)){
                            brrow++;
                        }
                }
            }
            hit_flag = false;
        }
        System.out.println(hit +" "+ brrow);
    }

}